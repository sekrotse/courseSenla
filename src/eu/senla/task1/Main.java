package eu.senla.task1;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {
    static byte _byte;
    static short _short;
    static int _int;
    static long _long;
    static float _float;
    static double _double;
    static char _char;
    static boolean _boolean;
    static Byte _byte1;
    static Short _short1;
    static Integer _int1;
    static Long _long1;
    static Float _float1;
    static Double _double1;
    static Character _char1;
    static Boolean _boolean1;
    static  String _str;
    public static void main(String[] args) {
        byte l_byte;
        short l_short;
        int l_int;
        long l_long;
        float l_float;
        double l_double;
        char l_char;
        boolean l_boolean;
        Byte l_byte1;
        Short l_short1;
        Integer l_int1;
        long l_long1;
        Float l_float1;
        Double l_double1;
        Character l_char1;
        Boolean l_boolean1;
        String l_str;

        l_byte = 1;
        l_byte1 = 42;
        l_short = 21;
        l_int = 3;
        l_long = 25635625653465l;
        l_float = 11.34234f;
        l_double = 123310.313121;
        l_char = '2';
        l_boolean = Boolean.TRUE;
        l_boolean1 = Boolean.FALSE;
        l_short1 = 200;
        l_int1 = 234234444;
        l_long1 = 112132;
        l_float1 = 123.3f;
        l_double1 = 2133.43424234234234d;
        l_char1 = 'a';
        l_str = "str".toUpperCase();
        System.out.println("boolean = " + l_boolean);
        System.out.println("Boolean = " + l_boolean1);
        System.out.println("byte = " + l_byte);
        System.out.println("Byte = " + l_byte1);
        System.out.println("short = " + l_short);
        System.out.println("Short = " + l_short1);
        System.out.println("int = " + l_int);
        System.out.println("Integer = " + l_int1);
        System.out.println("long = " + l_long);
        System.out.println("Long = " + l_long1);
        System.out.println("float = " + l_float);
        System.out.println("Float = " + l_float1);
        System.out.println("double = " + l_double);
        System.out.println("Double = " + l_double1);
        System.out.println("char = " + l_char);
        System.out.println("Character = " + l_char1);
        System.out.println("String = " + l_str);
        System.out.println();

        DataType dt = new DataType();
        dt.setbFlag(Boolean.FALSE);
        dt.setbFlag1(Boolean.TRUE);
        dt.setbNum(Byte.MAX_VALUE);
        dt.setbNum1(Byte.MIN_VALUE);
        dt.setsNum((short) 32767);
        dt.setsNum1((short)-32768);
        dt.setiNum(Integer.MAX_VALUE);
        dt.setiNum1(Integer.MIN_VALUE);
        dt.setlNum(Integer.MIN_VALUE);
        dt.setlNum1((long)Integer.MAX_VALUE);
        dt.setfNum(Float.MIN_VALUE);
        dt.setfNum1(Float.MAX_VALUE);
        dt.setdNum(Float.MAX_VALUE);
        dt.setdNum1(Double.MIN_VALUE);
        dt.setcSymbol('r');
        dt.setcSymbol1('_');
        dt.setStr("test string");


        System.out.println("boolean = " + dt.isbFlag());
        System.out.println("Boolean = " + dt.getbFlag1());
        System.out.println("byte = " + dt.getbNum());
        System.out.println("Byte = " + dt.getbNum1());
        System.out.println("short = " + dt.getsNum());
        System.out.println("Short = " + dt.getsNum1());
        System.out.println("int = " + dt.getiNum());
        System.out.println("Integer = " + dt.getiNum1());
        System.out.println("long = " + dt.getlNum());
        System.out.println("Long = " + dt.getlNum1());
        System.out.println("float = " + dt.getfNum());
        System.out.println("Float = " + dt.getfNum1());
        System.out.println("double = " + dt.getdNum());
        System.out.println("Double = " + dt.getdNum1());
        System.out.println("char = " + dt.getcSymbol());
        System.out.println("Character = " + dt.getStr());
        System.out.println("String = " + dt.getStr());
        System.out.println();

        _byte = (byte)128;
        _byte1 = 127;
        _short = 32000;
        _short1 = -32000;
        _int = 1;
        _int1 = 1;
        _long = 1;
        _long1 = 1l;
        _float = 1.0f;
        _float1 = 1.1f;
        _double = 2.3;
        _double1 = 2.3;
        _char = '1';
        _char1 = '*';
        _boolean = true;
        _boolean1 = false;
        _str = "test str";


        System.out.println("boolean = " + _boolean);
        System.out.println("Boolean = " + _boolean1);
        System.out.println("byte = " + _byte);
        System.out.println("Byte = " + _byte1);
        System.out.println("short = " + _short);
        System.out.println("Short = " + _short1);
        System.out.println("int = " + _int);
        System.out.println("Integer = " + _int1);
        System.out.println("long = " + _long);
        System.out.println("Long = " + _long1);
        System.out.println("float = " + _float);
        System.out.println("Float = " + _float1);
        System.out.println("double = " + _double);
        System.out.println("Double = " + _double1);
        System.out.println("char = " + _char);
        System.out.println("Character = " + _char1);
        System.out.println("String = " + _str);
        System.out.println();

        System.out.println(dt.isbFlag() && l_boolean1);

        l_byte1 = dt.getsNum1().byteValue();
        System.out.println(" l_byte1 = dt.getsNum1().byteValue() = " + _byte);
        l_str = "25.3";
        l_double = Double.parseDouble(l_str);
        System.out.println("l_double = Double.parseDouble(l_str) = " + l_double);

        dt.setbFlag(true);
        System.out.println("Boolean = " + dt.isbFlag());
        _int = (int)(dt.getiNum() + dt.getfNum1());
        _char = dt.getsNum1().toString().toCharArray()[0];
        System.out.println("_char = " + _char);
        l_str = _str.toLowerCase().replaceAll("t","T").substring(0,_str.length()-1);
        System.out.println("l_str = " + l_str);
        _str = String.valueOf(l_str.length());
        System.out.println("_str = " + _str);
        _double1 = _int * 234.6;
        System.out.println("_double1 = " + _double1);
        // _int1 = Integer.parseInt(_double1.toString()); java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        _int1 = _double1.intValue();
        System.out.println("_int1 = " + _int1);
        dt.setlNum1((_long1 + l_long));
        System.out.println("dt.getlNum1() = " + dt.getlNum1());

        _byte = (byte)(_byte1 + _int);
        System.out.println("_byte = (byte)(_byte1 + _int) = " + _byte);
        System.out.println("_char = " + _char);
        _char += _char1;
        System.out.println("_char = " + _char);
        _int1 =dt.getsNum() * dt.getbNum();
        System.out.println("_int1 =dt.getsNum() * dt.getbNum() = " + _int1);

        _str = String.valueOf(dt.getlNum());
        System.out.println("_str = String.valueOf(dt.getlNum()) = " + _str);
        _byte = (byte)_int;
        System.out.println("_byte = (byte)_int = " + _byte);
        _char = String.valueOf(l_boolean).toCharArray()[0];
        System.out.println("_char = String.valueOf(l_boolean).toCharArray()[0] = " + _char);
    }
}
