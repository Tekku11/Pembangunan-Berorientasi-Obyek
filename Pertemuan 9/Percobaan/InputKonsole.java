package Percobaan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputKonsole
{
    public static String readString()
    {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = " ";
        try
        {
            string = bfr.readLine();
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        return string;
    }

    public static int readInt()
    {
        return Integer.parseInt(readString());
    }

    public static double readDouble()
    {
        return Double.parseDouble(readString());
    }

}