package util;

public class BookCode {
    private static Integer codeBookYear;
    private static Integer codeBookType;
    private static Integer codeBookId = 1000;

    public BookCode(Integer codeBookYear, Integer codeBookType, Integer codeBookId) {
        BookCode.codeBookYear = codeBookYear;
        BookCode.codeBookType = codeBookType;
        BookCode.codeBookId = codeBookId;
    }
    public BookCode() {

    }

    public Integer getCodeBookYear() {
        return codeBookYear;
    }

    public void setCodeBookYear(Integer codeBookYear) {
        BookCode.codeBookYear = codeBookYear;
    }

    public Integer getCodeBookType() {
        return codeBookType;
    }

    public void setCodeBookType(Integer codeBookType) {
        BookCode.codeBookType = codeBookType;
    }

    public static Integer getCodeBookId() {
        return codeBookId;
    }

    public static void setCodeBookId(Integer codeBookId) {
        BookCode.codeBookId = codeBookId;
    }

    public static String generateCode (Integer year, Integer type){
        BookCode.codeBookYear = year;
        BookCode.codeBookType = type;
        String generated = "";
        try {
            if (type == 1) {
                generated = year + "-A-" + BookCode.codeBookId;
            } else {
                generated = year + "-B-" + BookCode.codeBookId;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return generated;

    }

    @Override
    public String toString() {
        return "BookCode{" +
                "codeBookYear='" + codeBookYear + '\'' +
                ", codeBookType='" + codeBookType + '\'' +
                ", codeBookId='" + codeBookId + '\'' +
                '}';
    }
}
