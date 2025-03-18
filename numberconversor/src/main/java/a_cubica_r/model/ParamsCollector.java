package a_cubica_r.model;

public class ParamsCollector {
    public static String[] collectParamsX64(String ieeeNumber) {
        if (ieeeNumber == null || ieeeNumber.length() != 64 || !ieeeNumber.matches("[01]+")) {
            return new String[] { "Non valid input", "Non valid input", "Non valid input" };
        }
        String[] params = new String[3];
        params[0] = ieeeNumber.substring(0, 1);
        params[1] = ieeeNumber.substring(1, 12);
        params[2] = ieeeNumber.substring(12);
        return params;
    }

    public static String[] collectParamsX32(String ieeeNumber) {
        if (ieeeNumber == null || ieeeNumber.length() != 32 || !ieeeNumber.matches("[01]+")) {
            return new String[] { "Non valid input", "Non valid input", "Non valid input" };
        }
        String[] params = new String[3];
        params[0] = ieeeNumber.substring(0, 1);
        params[1] = ieeeNumber.substring(1, 9);
        params[2] = ieeeNumber.substring(9);
        return params;
    }

    public static String[] collectResultX64(String ieeeNumber) {
        String[] params = new String[3];
        params[0] = ieeeNumber.substring(0, 1);
        params[1] = ieeeNumber.substring(1, 12);
        params[2] = ieeeNumber.substring(12);
        return params;
    }

    public static String[] collectResultX32(String ieeeNumber) {
        String[] params = new String[3];
        params[0] = ieeeNumber.substring(0, 1);
        params[1] = ieeeNumber.substring(1, 9);
        params[2] = ieeeNumber.substring(9);
        return params;
    }
}
