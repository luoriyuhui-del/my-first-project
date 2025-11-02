package wolk;

public class text04 {
    public static void main(String[] args) {
        String date[] = {"06/25/13", "07/03/07", "08/20/08", "08/24/08",
                "04/09/02", "03/02/01", "01/01/05", "04/13/01",
                "11/25/09", "09/10/03"};

        for (int i = 0; i < date.length; i++) {
            String str = date[i];
            // 提取年份
            String year = "20" + str.substring(6, 8);

            // 提取月份并转换为整数
            int month = Integer.parseInt(str.substring(0, 2));

            // 提取日期并转换为整数
            int day = Integer.parseInt(str.substring(3, 5));

            // 获取日期的后缀
            String dayNum = "";
            if (day == 1) {
                dayNum = "st";
            } else if (day == 2) {
                dayNum = "nd";
            } else if (day == 3) {
                dayNum = "rd";
            } else {
                dayNum = "th";
            }

            // 将月份数字转换为月份名称
            String monthName = getMonthName(month);

            // 输出转换后的日期格式
            System.out.println(day + dayNum + " " + monthName + " " + year);
        }
    }

    // 根据月份数字返回月份名称的方法
    private static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
}
