package oop;
import java.util.Scanner;
public class TuitonFeesCalculator {

    void feeCalculator() {
        while (true) {
            int choice;
            int perCredit=2000;
            int cseFees=319000,cseTotal=391000;
            int wav;
            int othersFees=72000;
            //start
            System.out.println("Select A Program");
            System.out.println("1)Undergraduate\t \t" + "2)Graduate");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if (choice == 1) { //protom ta
                System.out.println("Past Degree");
                System.out.println("1.HSC / Equivalent \t\t2.Diploma Holder");
                Scanner sc1 = new Scanner(System.in);
                int choice1 = sc.nextInt();
                switch (choice1) { //program er shuru
                    case 1:
                        System.out.println("*Select Your Desired Program*");
                        System.out.println("----------------------------");
                        System.out.println("1.Bachelor of Science in CSE");
                        System.out.println("2.Bachelor of Science in EEE");
                        System.out.println("3.Bachelor of Science in Civil Engineering");
                        System.out.println("4.Bachelor of Business Administration(BBA)");
                        System.out.println("5.Architecture");
                        System.out.println("6.English");
                        System.out.println("7.LAW");
                        Scanner sc2 = new Scanner(System.in);
                        int choice2 = sc2.nextInt();
                        switch (choice2){
                            case 1://cse
                                System.out.println("Combined GPA(SSC & HSC)");
                                System.out.println("-----------------------");
                                System.out.println("|   1. Golden A+       |");
                                System.out.println("|   2. 10.0            |");
                                System.out.println("|   3. 9.5 or more     |");
                                System.out.println("|   4. 9.0 or more     |");
                                System.out.println("|   5. 8.5 or more     |");
                                System.out.println("|   6. Less than 8.0   |");
                                System.out.println("------------------------");
                                Scanner sc3 = new Scanner(System.in);
                                int choice3 = sc3.nextInt();

                                switch (choice3) {

                                    case 1:
                                        wav = 100;
                                        int avg = (cseFees * wav) / 100;
                                        System.out.println("Thank you for choosing CSE.Total Cost of the Program is: 3,91,000 ৳.\n" +
                                                "You will enjoy a total of 100% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((cseFees - avg) + othersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 152);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 2:
                                        wav = 50;
                                        avg = (cseFees * wav) / 100;
                                        System.out.println("Thank you for choosing CSE.Total Cost of the Program is: 3,91,000 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((cseFees - avg) + othersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 152);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 3:
                                        wav = 35;
                                        avg = (cseFees * wav) / 100;
                                        System.out.println("Thank you for choosing CSE.Total Cost of the Program is: 3,91,000 ৳.\n" +
                                                "You will enjoy a total of 35% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((cseFees - avg) + othersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 152);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 4:
                                        wav = 25;
                                        avg = (cseFees * wav) / 100;
                                        System.out.println("Thank you for choosing CSE.Total Cost of the Program is: 3,91,000 ৳.\n" +
                                                "You will enjoy a total of 25% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((cseFees - avg) + othersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 152);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 5:
                                        wav = 15;
                                        avg = (cseFees * wav) / 100;
                                        System.out.println("Thank you for choosing CSE.Total Cost of the Program is: 3,91,000 ৳.\n" +
                                                "You will enjoy a total of 15% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((cseFees - avg) + othersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 152);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 6:


                                        System.out.println("Thank you for choosing CSE. Total Cost of the Program is: 4,78,700 ৳.\n" +
                                                "**You can avail Scholarships based on Semester wise result during your graduation at LU**");
                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 152);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    default:
                                        System.out.println("NOT IN THE LIST");
                                        break;
                                }
                                break;
                            case 2:
                                //EEE

                                int eeeTotal = 407000,eeeOthersFees = 78000,eeePerCredit = 2000,eeeFees = 329000;
                                System.out.println("Combined GPA(SSC & HSC)");
                                System.out.println("-----------------------");
                                System.out.println("|   1. Golden A+       |");
                                System.out.println("|   2. 10.0            |");
                                System.out.println("|   3. 9.5 or more     |");
                                System.out.println("|   4. 9.0 or more     |");
                                System.out.println("|   5. 8.5 or more     |");
                                System.out.println("|   6. Less than 8.0   |");
                                System.out.println("------------------------");
                                Scanner sc4 = new Scanner(System.in);
                                int choice4 = sc4.nextInt();

                                switch (choice4) {

                                    case 1:
                                        wav = 100;
                                        int avg = (eeeFees * wav) / 100;
                                        System.out.println("Thank you for choosing EEE.Total Cost of the Program is: 4,07,000 ৳.\n" +
                                                "You will enjoy a total of 100% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((eeeFees - avg) + eeeOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 157);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 2:
                                        wav = 50;
                                        avg = (eeeFees * wav) / 100;
                                        System.out.println("Thank you for choosing EEE.Total Cost of the Program is: 4,07,000 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((eeeFees - avg) + eeeOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 157);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 3:
                                        wav = 35;
                                        avg = (eeeFees * wav) / 100;
                                        System.out.println("Thank you for choosing EEE.Total Cost of the Program is: 4,07,000 ৳.\n" +
                                                "You will enjoy a total of 35% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((eeeFees - avg) + eeeOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 157);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 4:
                                        wav = 25;
                                        avg = (eeeFees * wav) / 100;
                                        System.out.println("Thank you for choosing EEE.Total Cost of the Program is: 4,07,000 ৳.\n" +
                                                "You will enjoy a total of 25% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((eeeFees - avg) + eeeOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 157);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 5:
                                        wav = 15;
                                        avg = (eeeFees * wav) / 100;
                                        System.out.println("Thank you for choosing EEE.Total Cost of the Program is: 4,07,000 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((eeeFees - avg) + eeeOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 157);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 6:


                                        System.out.println("Thank you for choosing EEE. Total Cost of the Program is: 4,07,000 ৳.\n" +
                                                "**You can avail Scholarships based on Semester wise result during your graduation at LU**");
                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 157);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    default:
                                        System.out.println("NOT IN THE LIST");
                                        break;

                                }
                                break;
                            case 3: //civil
                                int civilTotal = 480200, civilOthersFees = 127596, civilPerCredit = 2300, civilFees = 352604;
                                System.out.println("Combined GPA(SSC & HSC)");
                                System.out.println("-----------------------");
                                System.out.println("|   1. Golden A+       |");
                                System.out.println("|   2. 10.0            |");
                                System.out.println("|   3. 9.5 or more     |");
                                System.out.println("|   4. 9.0 or more     |");
                                System.out.println("|   5. 8.5 or more     |");
                                System.out.println("|   6. Less than 8.0   |");
                                System.out.println("------------------------");
                                Scanner sc5 = new Scanner(System.in);
                                int choice5 = sc5.nextInt();

                                switch (choice5) {

                                    case 1:
                                        wav = 100;
                                        int avg = (civilFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 4,80,200 ৳.\n" +
                                                "You will enjoy a total of 100% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((civilFees - avg) + civilOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 164);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 2:
                                        wav = 50;
                                        avg = (civilFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 4,80,200 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((civilFees - avg) + civilOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 164);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 3:
                                        wav = 35;
                                        avg = (civilFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 4,80,200 ৳.\n" +
                                                "You will enjoy a total of 35% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((civilFees - avg) + civilOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 164);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 4:
                                        wav = 25;
                                        avg = (civilFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 4,80,200 ৳.\n" +
                                                "You will enjoy a total of 25% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((civilFees - avg) + civilOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 164);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 5:
                                        wav = 15;
                                        avg = (civilFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 4,80,200 ৳.\n" +
                                                "You will enjoy a total of 15% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((civilFees - avg) + civilOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 164);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 6:


                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 4,80,200 ৳.\n" +
                                                "**You can avail Scholarships based on Semester wise result during your graduation at LU**");
                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 164);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    default:
                                        System.out.println("NOT IN THE LIST");
                                        break;
                                }
                                break;
                            case 4://bba shuru
                                int bbaTotal = 385200, bbaOthersFees = 5000, bbaPerCredit = 2350, bbaFees = 380200;
                                System.out.println("Combined GPA(SSC & HSC)");
                                System.out.println("-----------------------");
                                System.out.println("|   1. Golden A+       |");
                                System.out.println("|   2. 10.0            |");
                                System.out.println("|   3. 9.5 or more     |");
                                System.out.println("|   4. 9.0 or more     |");
                                System.out.println("|   5. 8.5 or more     |");
                                System.out.println("|   6. Less than 8.0   |");
                                System.out.println("------------------------");
                                Scanner sc6 = new Scanner(System.in);
                                int choice6 = sc6.nextInt();

                                switch (choice6) {

                                    case 1:
                                        wav = 100;
                                        int avg = (bbaFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 3,85,200 ৳.\n" +
                                                "You will enjoy a total of 100% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((bbaFees - avg) + bbaOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 132);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 2:
                                        wav = 50;
                                        avg = (bbaFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 3,85,200 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((bbaFees - avg) + bbaOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 132);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 3:
                                        wav = 35;
                                        avg = (bbaFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 3,85,200 ৳.\n" +
                                                "You will enjoy a total of 35% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((bbaFees - avg) + bbaOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 132);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 4:
                                        wav = 25;
                                        avg = (bbaFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 3,85,200 ৳.\n" +
                                                "You will enjoy a total of 25% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((bbaFees - avg) + bbaOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 132);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 5:
                                        wav = 15;
                                        avg = (bbaFees * wav) / 100;
                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 3,85,200 ৳.\n" +
                                                "You will enjoy a total of 15% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((bbaFees - avg) + bbaOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 132);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 6:


                                        System.out.println("Thank you for choosing Civil Engineering.Total Cost of the Program is: 3,85,200 ৳.\n" +
                                                "**You can avail Scholarships based on Semester wise result during your graduation at LU**");
                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 132);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    default:
                                        System.out.println("NOT IN THE LIST");
                                        break;
                                }
                                break;
                            case 5: //arch. shuru
                                int arcTotal = 590200, arcOthersFees = 10000, arcPerCredit = 2400, arcFees = 580200;
                                System.out.println("Combined GPA(SSC & HSC)");
                                System.out.println("-----------------------");
                                System.out.println("|   1. Golden A+       |");
                                System.out.println("|   2. 10.0            |");
                                System.out.println("|   3. 9.5 or more     |");
                                System.out.println("|   4. 9.0 or more     |");
                                System.out.println("|   5. 8.5 or more     |");
                                System.out.println("|   6. Less than 8.0   |");
                                System.out.println("------------------------");
                                Scanner sc7 = new Scanner(System.in);
                                int choice7 = sc7.nextInt();

                                switch (choice7) {

                                    case 1:
                                        wav = 100;
                                        int avg = (arcFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 5,90,200 ৳.\n" +
                                                "You will enjoy a total of 100% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((arcFees - avg) + arcOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 198);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 2:
                                        wav = 50;
                                        avg = (arcFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 5,90,200 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((arcFees - avg) + arcOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 198);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 3:
                                        wav = 35;
                                        avg = (arcFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 5,90,200 ৳.\n" +
                                                "You will enjoy a total of 35% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((arcFees - avg) + arcOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 198);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 4:
                                        wav = 25;
                                        avg = (arcFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 5,90,200 ৳.\n" +
                                                "You will enjoy a total of 25% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((arcFees - avg) + arcOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 198);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 5:
                                        wav = 15;
                                        avg = (arcFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 5,90,200 ৳.\n" +
                                                "You will enjoy a total of 15% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((arcFees - avg) + arcOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 198);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 6:


                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 5,90,200 ৳.\n" +
                                                "**You can avail Scholarships based on Semester wise result during your graduation at LU**");
                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 198);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    default:
                                        System.out.println("NOT IN THE LIST");

                                        break;
                                }
                                break;
                            case 6:// English
                                int engTotal = 285800, engOthersFees = 5000, engPerCredit = 1700, engFees = 280800;
                                System.out.println("Combined GPA(SSC & HSC)");
                                System.out.println("-----------------------");
                                System.out.println("|   1. Golden A+       |");
                                System.out.println("|   2. 10.0            |");
                                System.out.println("|   3. 9.5 or more     |");
                                System.out.println("|   4. 9.0 or more     |");
                                System.out.println("|   5. 8.5 or more     |");
                                System.out.println("|   6. Less than 8.0   |");
                                System.out.println("------------------------");
                                Scanner sc8 = new Scanner(System.in);
                                int choice8 = sc8.nextInt();

                                switch (choice8) {

                                    case 1:
                                        wav = 100;
                                        int avg = (engFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 2,85,800 ৳.\n" +
                                                "You will enjoy a total of 100% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((engFees - avg) + engOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 2:
                                        wav = 50;
                                        avg = (engFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 2,85,800 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((engFees - avg) + engOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 3:
                                        wav = 35;
                                        avg = (engFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 2,85,800 ৳.\n" +
                                                "You will enjoy a total of 35% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((engFees - avg) + engOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 4:
                                        wav = 25;
                                        avg = (engFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 2,85,800 ৳.\n" +
                                                "You will enjoy a total of 25% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((engFees - avg) + engOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 5:
                                        wav = 15;
                                        avg = (engFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 2,85,800 ৳.\n" +
                                                "You will enjoy a total of 15% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((engFees - avg) + engOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 6:


                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 2,85,800 ৳.\n" +
                                                "**You can avail Scholarships based on Semester wise result during your graduation at LU**");
                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    default:
                                        System.out.println("NOT IN THE LIST");

                                        break;
                                }
                                break;
                            case 7://law shuru
                                int lawTotal = 320700, lawOthersFees = 5000, lawPerCredit = 1950, lawFees = 315700;
                                System.out.println("Combined GPA(SSC & HSC)");
                                System.out.println("-----------------------");
                                System.out.println("|   1. Golden A+       |");
                                System.out.println("|   2. 10.0            |");
                                System.out.println("|   3. 9.5 or more     |");
                                System.out.println("|   4. 9.0 or more     |");
                                System.out.println("|   5. 8.5 or more     |");
                                System.out.println("|   6. Less than 8.0   |");
                                System.out.println("------------------------");
                                Scanner sc9 = new Scanner(System.in);
                                int choice9 = sc9.nextInt();

                                switch (choice9) {

                                    case 1:
                                        wav = 100;
                                        int avg = (lawFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 3,20,700 ৳.\n" +
                                                "You will enjoy a total of 100% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((lawFees - avg) + lawOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 126);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 2:
                                        wav = 50;
                                        avg = (lawFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 3,20,700 ৳.\n" +
                                                "You will enjoy a total of 50% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((lawFees - avg) + lawOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 3:
                                        wav = 35;
                                        avg = (lawFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 3,20,700 ৳.\n" +
                                                "You will enjoy a total of 35% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((lawFees - avg) + lawOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 4:
                                        wav = 25;
                                        avg = (lawFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 3,20,700 ৳.\n" +
                                                "You will enjoy a total of 25% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((lawFees - avg) + lawOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 5:
                                        wav = 15;
                                        avg = (lawFees * wav) / 100;
                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 3,20,700 ৳.\n" +
                                                "You will enjoy a total of 15% Waiver on your Tuition fees.\nSo,Total Cost of your Study is:" + ((lawFees - avg) + lawOthersFees) + "৳");

                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    case 6:


                                        System.out.println("Thank you for choosing Architecture.Total Cost of the Program is: 3,20,700 ৳.\n" +
                                                "**You can avail Scholarships based on Semester wise result during your graduation at LU**");
                                        System.out.println("********************");
                                        System.out.println("Total Credit :" + 124);
                                        System.out.println("Per Credit :" + perCredit + "৳");
                                        System.out.println("THANK YOU");
                                        break;
                                    default:
                                        System.out.println("NOT IN THE LIST");

                                        break;
                                }
                                break;
                        }
                    case 2:
                        System.out.println("1.Diploma in Data Telecommunication & Networking(Coming Soon)");
                        System.out.println("2.Diploma in Hotel Management(Coming Soon)");
                        Scanner scc3=new Scanner(System.in);
                        int choice12=scc3.nextInt();
                        if(choice12==1||choice12==2)
                        {
                            System.out.println("Coming Soon");
                        }
                        else
                        {
                            System.out.println("Not In The List");
                        }

                }//program er sesh
                System.out.println("\n\n");
            }//protom if
            else if(choice==2)
            {
                System.out.println("Select your Desired Program\n");
                System.out.println("1.M.Sc in CSE");
                System.out.println("2.MBA");
                System.out.println("3.LLM");
                Scanner scc=new Scanner(System.in);
                int choice10= scc.nextInt();

                if(choice10==1)
                {
                    System.out.println("YOUR CGPA (Bachelor)\n");
                    System.out.println("********************");
                    System.out.println("| 1) 3.5 or More   |");
                    System.out.println("| 2) 3.0 or More   |");
                    System.out.println("********************");
                    Scanner scc1=new Scanner(System.in);
                    int choice11= scc1.nextInt();
                    switch (choice11)
                    {
                        case 1:
                            System.out.println("Thank you for choosing Msc in CSE.Total Cost of the Program is: 1,13,300 ৳.\n"+
                                    "You will enjoy a total of 15% Waiver on your Tuition fees.\n" +
                                    "So, Total Cost of your Study is: 1,01,600 ৳");
                            break;
                        case 2:
                            System.out.println("Thank you for choosing Msc in CSE.Total Cost of the Program is: 1,13,300 ৳ .\n"+
                                    "You will enjoy a total of 10% Waiver on your Tuition fees.\n" +
                                    "So,Total Cost of your Study is: 1,05,500 ৳");

                    }//switch er brack

                }
                else if(choice10==2)
                {
                    System.out.println("YOUR CGPA (Bachelor)\n");
                    System.out.println("********************");
                    System.out.println("| 1) 3.5 or More   |");
                    System.out.println("| 2) 3.0 or More   |");
                    System.out.println("********************");
                    Scanner scc1=new Scanner(System.in);
                    int choice11= scc1.nextInt();
                    switch (choice11)
                    {
                        case 1:
                            System.out.println("Thank you for choosing MBA.Total Cost of the Program is: 1,33,700 ৳.\n"+
                                    "You will enjoy a total of 15% Waiver on your Tuition fees.\n" +
                                    "So, Total Cost of your Study is: 1,19,525 ৳");
                            break;
                        case 2:
                            System.out.println("Thank you for choosing MBA.Total Cost of the Program is: 1,33,700 ৳.\n"+
                                    "You will enjoy a total of 10% Waiver on your Tuition fees.\n" +
                                    "So,Total Cost of your Study is: 1,24,250 ৳");

                    }//switch er brack
                }
                else if(choice10==3)
                {
                    System.out.println("YOUR CGPA (Bachelor)\n");
                    System.out.println("********************");
                    System.out.println("| 1) 3.5 or More   |");
                    System.out.println("| 2) 3.0 or More   |");
                    System.out.println("********************");
                    Scanner scc1=new Scanner(System.in);
                    int choice11= scc1.nextInt();
                    switch (choice11)
                    {
                        case 1:
                            System.out.println("Thank you for choosing LLM(Law).Total Cost of the Program is: 86,200 ৳.\n"+
                                    "You will enjoy a total of 15% Waiver on your Tuition fees.\n" +
                                    "So, Total Cost of your Study is: 77,200 ৳");
                            break;
                        case 2:
                            System.out.println("Thank you for choosing LLM(Law).Total Cost of the Program is: 86,200 ৳ .\n"+
                                    "You will enjoy a total of 10% Waiver on your Tuition fees.\n" +
                                    "So,Total Cost of your Study is: 80,200 ৳");

                    }//switch er brack
                }
                else
                {
                    System.out.println("Not in The List\n\n");
                }
                System.out.println("\nTHANK YOU\n\n");
            }//else if er bracket
        }
    }//while er brak

}

