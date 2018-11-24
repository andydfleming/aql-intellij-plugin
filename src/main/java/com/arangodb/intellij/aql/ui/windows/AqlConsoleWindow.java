package com.arangodb.intellij.aql.ui.windows;

import com.arangodb.intellij.aql.actions.ActionBusEvent;
import com.arangodb.intellij.aql.actions.ActionEventData;
import com.arangodb.intellij.aql.util.log;
import com.intellij.execution.ui.layout.impl.JBRunnerTabs;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.util.ui.JBEmptyBorder;
import com.intellij.util.ui.JBUI;

import javax.swing.*;

public class AqlConsoleWindow implements Disposable {
    public static final String WINDOW_ID = "ArangoDB Console";

    private JPanel panel;
    private JBRunnerTabs JBRunnerTabs1;

    private final Project project;


    public AqlConsoleWindow(final Project project, final ToolWindow toolWindow) {
        this.project = project;


    }

    private void setupUi() {
        final JBEmptyBorder border = JBUI.Borders.empty();
        project.getMessageBus().connect().subscribe(ActionBusEvent.AQL_QUERY_RESULT, this::processQuery);
        final ActionGroup consoleActionGroup = (ActionGroup) ActionManager.getInstance().getAction(ActionBusEvent.ACTION_CONSOLE);

    }
    private void processQuery(final ActionEventData data) {
        //jsonPanel.onMessage(data, project);
        log.info("query {}", data.get(ActionEventData.KEY_QUERY));
    }


    private void createUIComponents() {

    }

    public JComponent getContent() {
        return panel;
    }

    @Override
    public void dispose() {
        // TODO
    }

}