package a_cubica_r.model;

public class NumberGuardian {

    public static String passIEEENumber(String number, ArchtypeOperator base) {
        if (isValidIEEE(number)) {
            switch (base) {
                case X32 -> {
                    return ArchtypeOperator.X32.toDECM(number);
                }
                case X64 -> {
                    return ArchtypeOperator.X64.toDECM(number);
                }
            }
        }
        return "The number is not a valid IEEE number.";
    }

    public static String passDECNumber(String number, ArchtypeOperator base) {
        if (isValidDEC(number)) {
            switch (base) {
                case X32 -> {
                    return ArchtypeOperator.X32.toIEEE(number);
                }
                case X64 -> {
                    return ArchtypeOperator.X64.toIEEE(number);
                }
            }
        }
        return "The number is not a valid DEC number.";
    }

    private static boolean isValidDEC(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidIEEE(String number) {
        return isValidIEEE32(number) || isValidIEEE64(number);
    }

    private static boolean isValidIEEE32(String number) {
        try {
            Float.parseFloat(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidIEEE64(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
