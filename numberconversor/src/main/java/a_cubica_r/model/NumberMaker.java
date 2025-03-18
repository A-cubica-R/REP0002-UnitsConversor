package a_cubica_r.model;

public class NumberMaker {
    public static String decimalTo_X32(String decimal) {
        float value = Float.parseFloat(decimal);
        int intBits = Float.floatToIntBits(value);
        return String.format("%32s", Integer.toBinaryString(intBits)).replace(' ', '0');
    }

    public static String decimalTo_X64(String decimal) {
        double value = Double.parseDouble(decimal);
        long longBits = Double.doubleToLongBits(value);
        return String.format("%64s", Long.toBinaryString(longBits)).replace(' ', '0');
    }

    public static String ieeeX32To_decimal(String ieee754) {
        int intBits = Integer.parseUnsignedInt(ieee754, 2);  // Corregido
        float value = Float.intBitsToFloat(intBits);
        return Float.toString(value);
    }

    public static String ieeeX64To_decimal(String ieee754) {
        long longBits = Long.parseUnsignedLong(ieee754, 2);  // Corregido
        double value = Double.longBitsToDouble(longBits);
        return Double.toString(value);
    }
}

