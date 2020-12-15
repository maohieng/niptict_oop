package decision;

import java.util.Scanner;

/**
 * A program to find out the Cambodia Zodiac name for the given year.
 * The Cambodia Zodiac is based on 12-year cycle, with each year
 * represented by an animal–វក ស្វា, រកា មាន់, ច ឆ្កែ, កោរ ជ្រូក, ជូត កណ្ដុរ, ឆ្លូវ គោ,
 * ខាល ខ្លា, ថោះ ទន្សាយ, រោង នាគរាជ, ម្សាញ់ ពស់, មមី សេះ, មមែ ពពែ.
 *
 * Note year % 12 determine the Zodiac name.
 * 1900 is the year of the ជូត កណ្ដុរ, 1900 % 12 is 4.
 */
public class CambodiaZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("វក ស្វា");
                break;
            case 1:
                System.out.println("រកា មាន់");
                break;
            case 2:
                System.out.println("ច ឆ្កែ");
                break;
            case 3:
                System.out.println("កោរ ជ្រូក");
                break;
            case 4:
                System.out.println("ជូត កណ្ដុរ");
                break;
            case 5: System.out.println("ឆ្លូវ គោ"); break;
            case 6: System.out.println("ខាល ខ្លា"); break;
            case 7: System.out.println("ថោះ ទន្សាយ"); break;
            case 8: System.out.println("រោង នាគរាជ"); break;
            case 9: System.out.println("ម្សាញ់ ពស់"); break;
            case 10: System.out.println("មមី សេះ"); break;
            case 11: System.out.println("មមែ ពពែ"); break;
        }
    }
}
