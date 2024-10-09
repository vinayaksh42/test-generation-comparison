package org.dynjs.cli;

import static org.junit.Assert.*;

import org.junit.Test;
import org.kohsuke.args4j.CmdLineParser;
import org.dynjs.cli.Arguments;

public class ArgumentTest {

  @Test
  public void testArgumentParsing() throws Exception {
    String[] args = { "--debug", "script.js", "arg1", "arg2" };
    Arguments arguments = new Arguments();
    CmdLineParser parser = new CmdLineParser(arguments);
    parser.parseArgument(args);

    // Verify that the debug option is parsed correctly
    assertTrue(arguments.isDebug());

    // Verify that the filename is parsed correctly
    assertEquals("script.js", arguments.getFilename());

    // Verify that the remaining arguments are parsed correctly
    String[] expectedArgsOldVersion = { "arg1", "arg2" }; // Expected in args4j 2.0.26
    String[] expectedArgsNewVersion = { "script.js", "arg1", "arg2" }; // Actual in args4j 2.33

    // This assertion will fail in args4j 2.33
    assertArrayEquals("Expected arguments do not match in args4j 2.33", expectedArgsOldVersion,
        arguments.getConfig().getArgv());

    // To demonstrate the breaking change, we can also assert the actual behavior in
    // args4j 2.33
    // Uncomment the line below to see the actual arguments in args4j 2.33
    // assertArrayEquals(expectedArgsNewVersion, arguments.getConfig().getArgv());
  }
}
