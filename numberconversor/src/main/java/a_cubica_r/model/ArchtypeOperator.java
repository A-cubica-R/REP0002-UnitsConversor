package a_cubica_r.model;

public enum ArchtypeOperator {
    X32 {
        @Override
        public String toIEEE(String number) {
            return NumberMaker.decimalTo_X32(number);
        }
        @Override
        public String toDECM(String number) {
            return NumberMaker.ieeeX64To_decimal(number);
        }
    },
    X64 {
        @Override
        public String toIEEE(String number) {
            return NumberMaker.decimalTo_X64(number);
        }
        @Override
        public String toDECM(String number) {
            return NumberMaker.ieeeX64To_decimal(number);
        }
    };
    public abstract String toIEEE(String number);
    public abstract String toDECM(String number);
}
