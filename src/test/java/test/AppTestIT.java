package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTestIT
{

    @Test
    void testExecute()
    {
        Assertions.assertEquals( "test", new App().execute( "test" ) );
    }
}
