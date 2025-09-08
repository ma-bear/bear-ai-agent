package com.bear.bearaiagent.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author: ma bear
 * @date: 2025/9/8 13:24
 */
@SpringBootTest
public class TerminalOperationToolTest {

    @Test
    public void testExecuteTerminalCommand() {
        TerminalOperationTool tool = new TerminalOperationTool();
        String command = "ls -l";
        String result = tool.executeTerminalCommand(command);
        assertNotNull(result);
    }
}
