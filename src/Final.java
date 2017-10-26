import javax.swing.*;

public class Final {
    public enum Months {Select, January, February, March, April, May, June, July, August, September, October, November, December}

    public static void main(String[] args) {
        Months[] choices = {Months.Select, Months.January, Months.February, Months.March, Months.April, Months.May, Months.June,
                Months.July, Months.August, Months.September, Months.October, Months.November, Months.December};
        Months ok = (Months) JOptionPane.showInputDialog(null, "Select the month.",
                "Months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);

        while (ok!=null) {

            switch (ok){
                case December:case January: case February:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snow man? ");
                    break;
                case March:case April:case May:
                    JOptionPane.showMessageDialog(null, "Happy Spring day ");
                    break;
                case June:case July:case August:
                    JOptionPane.showMessageDialog(null, "A Summer time");
                    break;
                case October:case November:case September:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season! ");
                    break;
            }


            ok = (Months) JOptionPane.showInputDialog(null,"Select the months.", "List of months",
                    JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);


        }
    }


}

