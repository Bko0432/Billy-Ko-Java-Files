package cp1;

import java.text.DecimalFormat;

public class A08_InputNumber05
{

	public static void main(String[] args)
	{
        double money = 15.9;
        double mula = 36.56789;

        DecimalFormat myDecimalFormat = new DecimalFormat("0.00");

        System.out.println(myDecimalFormat.format(money));
        System.out.println(myDecimalFormat.format(mula));
	}

}
