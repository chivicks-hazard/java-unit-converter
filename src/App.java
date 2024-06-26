import java.util.Scanner;

import DataConvert.*;
import DataConvert.Byte;
import LengConvert.*;
import MassConvert.*;
import TempConvert.*;
import TimeConvert.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which unit do you want to convert?");
        System.out.println();
        System.out.println("Temperature: temp");
        System.out.println("Data: data");
        System.out.println("Time: time");
        System.out.println("Mass: mass");
        System.out.println("Length: leng");
        System.out.println();
        String command = input.nextLine();

        Convert(command, input);
        input.close();
    }

    static void Convert(String command, Scanner input) {
        while (!command.equalsIgnoreCase("no")) {
            switch (command) {
                case "temp":
                    System.out.println("Which temperature do you want to convert to?");
                    System.out.println("Fahrenheit to Clesius: fahr2cel");
                    System.out.println("Fahrenheit to Kelvin: fahr2kel");
                    System.out.println("Celsius to Fahrenheit: cel2fahr");
                    System.out.println("Celsius to Kelvin: cel2kel");
                    System.out.println("Kelvin to Clesius: kel2cel");
                    System.out.println("Kelvin to Fahrenheit: kel2fahr");
                    System.out.println();
                    String tempConvertRate = input.nextLine();
                    System.out.println("OK\nType it in: ");
                    double temperature = input.nextDouble();
                    input.nextLine(); // Consume the newline character

                    switch (tempConvertRate.toLowerCase()) {
                        // Fahrenheit
                        case "fahr2cel":
                            temperature = FahrNCel.Fahr2Cel(temperature);
                            System.out.println("Temperature: " + temperature + "C");
                            break;
                    
                        case "fahr2kel":
                            temperature = FahrNKel.Fahr2Kel(temperature);
                            System.out.println("Temperature: " + temperature + "K");
                            break;
                        
                        // Celsius
                        case "cel2fahr":
                            temperature = FahrNCel.Cel2Fahr(temperature);
                            System.out.println("Temperature: " + temperature + "F");
                            break;
                    
                        case "cel2kel":
                            temperature = CelNKel.Cel2Kel(temperature);
                            System.out.println("Temperature: " + temperature + "K");
                            break;
                    
                        case "kel2cel":
                            temperature = CelNKel.Kel2Cel(temperature);
                            System.out.println("Temperature: " + temperature + "C");
                            break;

                        // Kelvin
                        case "kel2fahr":
                            temperature = FahrNKel.Kel2Fahr(temperature);
                            System.out.println("Temperature: " + temperature + "F");
                            break;
        
                        default:
                            System.out.println("Invalid command");
                            break;
                    }
                    break;

                case "mass":
                    System.out.println("Which mass do you want to convert to?");
                    System.out.println("Gram to Kilogram: gram2kg");
                    System.out.println("Gram to Ton: gram2ton");
                    System.out.println("Gram to Pound: gram2lb");
                    System.out.println("Gram to Ounce: gram2oz");
                    System.out.println("Gram to US Ton: gram2ust");
                    System.out.println("Gram to UK Ton: gram2ukt");
                    System.out.println("Kilogram to Gram: kg2gram");
                    System.out.println("Kilogram to Ton: kg2ton");
                    System.out.println("Kilogram to Pound: kg2lb");
                    System.out.println("Kilogram to Ounce: kg2oz");
                    System.out.println("Kilogram to US Ton: kg2ust");
                    System.out.println("Kilogram to UK Ton: kg2ukt");
                    System.out.println("Ton to Gram: ton2gram");
                    System.out.println("Ton to Kilogram: ton2kg");
                    System.out.println("Ton to Pound: ton2lb");
                    System.out.println("Ton to Ounce: ton2oz"); 
                    System.out.println("Ton to US Ton: ton2ust");
                    System.out.println("Ton to UK Ton: ton2ukt");
                    System.out.println("Pound to Gram: lb2gram");
                    System.out.println("Pound to Kilogram: lb2kg");
                    System.out.println("Pound to Ton: lb2ton");
                    System.out.println("Pound to Ounce: lb2oz");
                    System.out.println("Pound to US Ton: lb2ust");
                    System.out.println("Pound to UK Ton: lb2ukt");
                    System.out.println("Ounce to Gram: oz2gram");
                    System.out.println("Ounce to Kilogram: oz2kg");
                    System.out.println("Ounce to Ton: oz2ton");
                    System.out.println("Ounce to Pound: oz2lb");
                    System.out.println("Ounce to US Ton: oz2ust");
                    System.out.println("Ounce to UK Ton: oz2ukt");
                    System.out.println("US Ton to Gram: ust2gram");
                    System.out.println("US Ton to Kilogram: ust2kg");
                    System.out.println("US Ton to Ton: ust2ton");
                    System.out.println("US Ton to Pound: ust2lb");
                    System.out.println("US Ton to Ounce: ust2oz");
                    System.out.println("US Ton to UK Ton: ust2ukt");
                    System.out.println("UK Ton to Gram: ukt2gram");
                    System.out.println("UK Ton to Kilogram: ukt2kg");
                    System.out.println("UK Ton to Ton: ukt2ton");
                    System.out.println("UK Ton to Pound: ukt2lb");
                    System.out.println("UK Ton to Ounce: ukt2oz");
                    System.out.println("UK Ton to US Ton: ukt2ust");
                    System.out.println();
                    String massConvertRate = input.nextLine();
                    System.out.println("OK\nType it in: ");
                    double mass = input.nextDouble();
                    input.nextLine();
                    
                    switch (massConvertRate.toLowerCase()) {
                        // Gram
                        case "gram2kg":
                            mass = Gram.Gram2KG(mass);
                            System.out.println(mass + " kg");
                            break;

                        case "gram2ton":
                            mass = Gram.Gram2Ton(mass);
                            System.out.println(mass + " ton");
                            break;

                        case "gram2lb":
                            mass = Gram.Gram2LB(mass);
                            System.out.println(mass + " lb");
                            break;

                        case "gram2oz":
                            mass = Gram.Gram2OZ(mass);
                            System.out.println(mass + " oz");
                            break;

                        case "gram2ust":
                            mass = Gram.Gram2UST(mass);
                            System.out.println(mass + " t(US)");
                            break;

                        case "gram2ukt":
                            mass = Gram.Gram2UKT(mass);
                            System.out.println(mass + " t(UK)");
                            break;

                        // Kilogram
                        case "kg2gram":
                            mass = Kilogram.KG2Gram(mass);
                            System.out.println(mass + " g");
                            break;

                        case "kg2ton":
                            mass = Kilogram.KG2Ton(mass);
                            System.out.println(mass + " t");
                            break;

                        case "kg2lb":
                            mass = Kilogram.KG2LB(mass);
                            System.out.println(mass + " lb");
                            break;

                        case "kg2oz":
                            mass = Kilogram.KG2OZ(mass);
                            System.out.println(mass + " oz");
                            break;

                        case "kg2ust":
                            mass = Kilogram.KG2UST(mass);
                            System.out.println(mass + " t(US)");
                            break;

                        case "kg2ukt":
                            mass = Kilogram.KG2UKT(mass);
                            System.out.println(mass + " t(UK)");
                            break;

                        // Pound
                        case "lb2gram":
                            mass = Pound.LB2Gram(mass);
                            System.out.println(mass + " g");
                            break;

                        case "lb2kg":
                            mass = Pound.LB2KG(mass);
                            System.out.println(mass + " kg");
                            break;

                        case "lb2ton":
                            mass = Pound.LB2Ton(mass);
                            System.out.println(mass + " t");
                            break;

                        case "lb2oz":
                            mass = Pound.LB2OZ(mass);
                            System.out.println(mass + " oz");
                            break;

                        case "lb2ust":
                            mass = Pound.LB2UST(mass);
                            System.out.println(mass + " t(US)");
                            break;

                        case "lb2ukt":
                            mass = Pound.LB2UKT(mass);
                            System.out.println(mass + " t(UK)");
                            break;

                        // Ton
                        case "ton2gram":
                            mass = Ton.Ton2Gram(mass);
                            System.out.println(mass + " g");
                            break;

                        case "ton2kg":
                            mass = Ton.Ton2KG(mass);
                            System.out.println(mass + " kg");
                            break;
                        
                        case "ton2lb":
                            mass = Ton.Ton2LB(mass);
                            System.out.println(mass + " lb");
                            break;

                        case "ton2oz":
                            mass = Ton.Ton2OZ(mass);
                            System.out.println(mass + " oz");
                            break;

                        case "ton2ukt":
                            mass = Ton.Ton2UKT(mass);
                            System.out.println(mass + " t(UK)");
                            break;

                        case "ton2ust":
                            mass = Ton.Ton2UST(mass);
                            System.out.println(mass + " t(US)");
                            break;

                        // Ounce
                        case "oz2gram":
                            mass = Ounce.OZ2Gram(mass);
                            System.out.println(mass + " g");
                            break;

                        case "oz2kg":
                            mass = Ounce.OZ2KG(mass);
                            System.out.println(mass + " kg");
                            break;

                        case "oz2ton":
                            mass = Ounce.OZ2Ton(mass);
                            System.out.println(mass + " t");
                            break;

                        case "oz2lb":
                            mass = Ounce.OZ2LB(mass);
                            System.out.println(mass + " lb");
                            break;

                        case "oz2ukt":
                            mass = Ounce.OZ2UKT(mass);
                            System.out.println(mass + " t(UK)");
                            break;

                        case "oz2ust":
                            mass = Ounce.OZ2UST(mass);
                            System.out.println(mass + " t(US)");
                            break;

                        // Ton(UK)
                        case "ukt2gram":
                            mass = UKT.UKT2Gram(mass);
                            System.out.println(mass + " g");
                            break;

                        case "ukt2kg":
                            mass = UKT.UKT2KG(mass);
                            System.out.println(mass + " kg");
                            break;

                        case "ukt2ton":
                            mass = UKT.UKT2Ton(mass);
                            System.out.println(mass + " t");
                            break;

                        case "ukt2lb":
                            mass = UKT.UKT2LB(mass);
                            System.out.println(mass + " lb");
                            break;

                        case "ukt2oz":
                            mass = UKT.UKT2OZ(mass);
                            System.out.println(mass + " oz");
                            break;

                        case "ukt2ust":
                            mass = UKT.UKT2UST(mass);
                            System.out.println(mass + " t(US)");
                            break;

                        // Ton(US)
                        case "ust2gram":
                            mass = UST.UST2Gram(mass);
                            System.out.println(mass + " g");
                            break;

                        case "ust2kg":
                            mass = UST.UST2KG(mass);
                            System.out.println(mass + " kg");
                            break;

                        case "ust2ton":
                            mass = UST.UST2Ton(mass);
                            System.out.println(mass + " t");
                            break;

                        case "ust2lb":
                            mass = UST.UST2LB(mass);
                            System.out.println(mass + " lb");
                            break;

                        case "ust2oz":
                            mass = UST.UST2OZ(mass);
                            System.out.println(mass + " oz");
                            break;

                        case "ust2ukt":
                            mass = UST.UST2UKT(mass);
                            System.out.println(mass + " t(UK)");
                            break;

                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;

                case "data":
                    System.out.println("Which data do you want to convert to?");
                    System.out.println("Bit to Byte: bit2byte");
                    System.out.println("Byte to Bit: byte2bit");
                    System.out.println("Bit to KB: bit2kb");
                    System.out.println("KB to Bit: kb2bit");
                    System.out.println("Bit to MB: bit2mb");
                    System.out.println("MB to Bit: mb2bit");
                    System.out.println("Bit to GB: bit2gb");
                    System.out.println("GB to Bit: gb2bit");
                    System.out.println("Bit to TB: bit2tb");
                    System.out.println("TB to Bit: tb2bit");
                    System.out.println("Byte to KB: byte2kb");
                    System.out.println("KB to Byte: kb2byte");
                    System.out.println("Byte to MB: byte2mb");
                    System.out.println("MB to Byte: mb2byte");
                    System.out.println("Byte to GB: byte2gb");
                    System.out.println("GB to Byte: gb2byte");
                    System.out.println("Byte to TB: byte2tb");
                    System.out.println("TB to Byte: tb2byte");
                    System.out.println("KB to MB: kb2mb");
                    System.out.println("MB to KB: mb2kb");
                    System.out.println("KB to GB: kb2gb");
                    System.out.println("GB to KB: gb2kb");
                    System.out.println("KB to TB: kb2tb");
                    System.out.println("TB to KB: tb2kb");
                    System.out.println("MB to GB: mb2gb");
                    System.out.println("GB to MB: gb2mb");
                    System.out.println("MB to TB: mb2tb");
                    System.out.println("TB to MB: tb2mb");
                    System.out.println("GB to TB: gb2tb");
                    System.out.println("TB to GB: tb2gb");
                    System.out.println();
                    String dataConvertRate = input.nextLine();
                    System.out.println("OK\nType it in: ");
                    double data = input.nextDouble();
                    input.nextLine();

                    switch (dataConvertRate.toLowerCase()) {
                        // Bit
                        case "bit2byte":
                        data = Bit.Bit2Byte(data);
                        System.out.println(data + "B");
                        break;

                        case "bit2kb":
                        data = Bit.Bit2KB(data);
                        System.out.println(data + "KB");
                        break;

                        case "bit2mb":
                        data = Bit.Bit2MB(data);
                        System.out.println(data + "MB");
                        break;

                        case "bit2gb":
                        data = Bit.Bit2GB(data);
                        System.out.println(data + "GB");
                        break;

                        case "bit2tb":
                        data = Bit.Bit2TB(data);
                        System.out.println(data + "TB");

                        // Byte
                        case "byte2bit":
                        data = Byte.Byte2Bit(data);
                        System.out.println(data + "bit");
                        break;

                        case "byte2kb":
                        data = Byte.Byte2KB(data);
                        System.out.println(data + "KB");
                        break;

                        case "byte2mb":
                        data = Byte.Byte2MB(data);
                        System.out.println(data + "MB");
                        break;

                        case "byte2gb":
                        data = Byte.Byte2GB(data);
                        System.out.println(data + "GB");
                        break;

                        case "byte2tb":
                        data = Byte.Byte2TB(data);
                        System.out.println(data + "TB");
                        break;

                        // KB
                        case "kb2bit":
                        data = KB.KB2Bit(data);
                        System.out.println(data + "bit");
                        break;

                        case "kb2byte":
                        data = KB.KB2Byte(data);
                        System.out.println(data + "B");
                        break;

                        case "kb2mb":
                        data = KB.KB2MB(data);
                        System.out.println(data + "MB");
                        break;

                        case "kb2gb":
                        data = KB.KB2GB(data);
                        System.out.println(data + "GB");
                        break;

                        case "kb2tb":
                        data = KB.KB2TB(data);
                        System.out.println(data + "TB");
                        break;

                        // MB
                        case "mb2bit":
                        data = MB.MB2Bit(data);
                        System.out.println(data + "bit");
                        break;

                        case "mb2byte":
                        data = MB.MB2Byte(data);
                        System.out.println(data + "B");
                        break;

                        case "mb2kb":
                        data = MB.MB2KB(data);
                        System.out.println(data + "KB");
                        break;

                        case "mb2gb":
                        data = MB.MB2GB(data);
                        System.out.println(data + "GB");
                        break;

                        case "mb2tb":
                        data = MB.MB2TB(data);
                        System.out.println(data + "TB");
                        break;

                        // GB
                        case "gb2bit":
                        data = GB.GB2Bit(data);
                        System.out.println(data + "Bit");
                        break;

                        case "gb2byte":
                        data = GB.GB2Byte(data);
                        System.out.println(data + "B");
                        break;

                        case "gb2kb":
                        data = GB.GB2KB(data);
                        System.out.println(data + "KB");
                        break;

                        case "gb2mb":
                        data = GB.GB2MB(data);
                        System.out.println(data + "MB");
                        break;

                        case "gb2tb":
                        data = GB.GB2TB(data);
                        System.out.println(data + "TB");
                        break;

                        // TB
                        case "tb2bit":
                        data = TB.TB2Bit(data);
                        System.out.println(data + "Bit");
                        break;

                        case "tb2byte":
                        data = TB.TB2Byte(data);
                        System.out.println(data + "B");
                        break;

                        case "tb2kb":
                        data = TB.TB2KB(data);
                        System.out.println(data + "KB");
                        break;

                        case "tb2mb":
                        data = TB.TB2MB(data);
                        System.out.println(data);
                        break;

                        case "tb2gb":
                        data = TB.TB2GB(data);
                        System.out.println(data);
                        break;

                        default:
                            System.out.println("Invalid command");
                            break;
                    }
                    break;
                
                case "time":
                    System.out.println("Which time do you want to convert to?");
                    System.out.println("Millisecond to Second: ms2s");
                    System.out.println("Millisecond to Minute: msmin");
                    System.out.println("Millisecond to Hour: ms2hr");
                    System.out.println("Millisecond to Day: ms2day");
                    System.out.println("Millisecond to Week: ms2wk");
                    System.out.println("Millisecond to Year: ms2yr");
                    System.out.println("Second to Millisecond: s2ms");
                    System.out.println("Second to Minute: s2min");
                    System.out.println("Second to Hour: s2hr");
                    System.out.println("Second to Day: s2day");
                    System.out.println("Second to Week: s2wk");
                    System.out.println("Second to Year: s2yr");
                    System.out.println("Minute to Millisecond: min2ms");
                    System.out.println("Minute to Second: min2s");
                    System.out.println("Minute to Hour: min2hr");
                    System.out.println("Minute to Day: min2day");
                    System.out.println("Minute to Week: min2wk");
                    System.out.println("Minute to Year: min2yr");
                    System.out.println("Hour to Millisecond: hr2ms");
                    System.out.println("Hour to Second: hr2s");
                    System.out.println("Hour to Minute: hr2min");
                    System.out.println("Hour to Day: hr2day");
                    System.out.println("Hour to Week: hr2wk");
                    System.out.println("Hour to Year: hr2yr");
                    System.out.println("Day to Millisecond: day2ms");
                    System.out.println("Day to Second: day2s");
                    System.out.println("Day to Minute: day2min");
                    System.out.println("Day to Hour: day2hr");
                    System.out.println("Day to Week: day2wk");
                    System.out.println("Day to Year: day2yr");
                    System.out.println("Week to Millisecond: wk2ms");
                    System.out.println("Week to Second: wk2s");
                    System.out.println("Week to Minute: wk2min");
                    System.out.println("Week to Hour: wk2hr");
                    System.out.println("Week to Day: wk2day");
                    System.out.println("Week to Year: wk2yr");
                    System.out.println("Year to Millisecond: yr2ms");
                    System.out.println("Year to Second: yr2s");
                    System.out.println("Year to Minute: yr2min");
                    System.out.println("Year to Hour: yr2hr");
                    System.out.println("Year to Day: yr2day");
                    System.out.println("Year to Week: yr2wk");
                    System.out.println();
                    String timeConvertRate = input.nextLine();
                    if (command.toLowerCase().startsWith("min")
                        || command.toLowerCase().startsWith("hr")
                        || command.toLowerCase().startsWith("day")
                        || command.toLowerCase().startsWith("wk")
                        || command.toLowerCase().startsWith("yr")) {
                        System.out.println("N/B: No decimal numbers, only whole numbers.");
                        System.out.println("Type it in: ");
                    } else {
                        System.out.println("Type it in: ");
                    }
                    double time = input.nextDouble();
                    input.nextLine();  
                    
                    switch (timeConvertRate.toLowerCase()) {
                        // Millisecond
                        case "ms2s":
                            time = MS.MS2Sec(time);
                            System.out.println(time + " seconds");
                            break;
                        
                        case "msmin":
                            time = MS.MS2Min(time);
                            System.out.println(time + " minutes");
                            break;
                        
                        case "ms2hr":
                            time = MS.MS2Hour(time);
                            System.out.println(time + " hours");
                            break;
                        
                        case "ms2day":
                            time = MS.MS2Day(time);
                            System.out.println(time + " days");
                            break;
                        
                        case "ms2wk":
                            time = MS.MS2Week(time);
                            System.out.println(time + " weeks");
                            break;

                        case "ms2yr":
                            time = MS.MS2Year(time);
                            System.out.println(time + " years");
                            break;

                        // Second
                        case "sec2ms":
                            time = Second.Sec2Min(time);
                            System.out.println(time + " ms");
                            break;
                        
                        case "sec2min":
                            time = Second.Sec2Min(time);
                            System.out.println(time + " minutes");
                            break;

                        case "sec2hr":
                            time = Second.Sec2HR(time);
                            System.out.println(time + " hours");
                        
                        case "sec2day":
                            time = Second.Sec2Day(time);
                            System.out.println(time + " days");
                            break;

                        case "sec2wk":
                            time = Second.Sec2WK(time);
                            System.out.println(time + " weeks");
                            break;

                        case "sec2yr":
                            time = Second.Sec2HR(time);
                            System.out.println(time + " years");
                            break;

                        // Minute
                        case "min2ms":
                            time = Minute.Min2MS(time);
                            System.out.println((int)time + " ms");
                            break;

                        case "min2sec":
                            time = Minute.Min2Sec(time);
                            System.out.println((int)time + " seconds");
                            break;

                        case "min2hr":
                            time = Minute.Min2HR(time);
                            System.out.println(time + " hours");
                            break;

                        case "min2day":
                            time = Minute.Min2Day(time);
                            System.out.println(time + " days");
                            break;

                        case "min2wk":
                            time = Minute.Min2WK(time);
                            System.out.println(time + " weeks");
                            break;

                        case "min2yr":
                            time = Minute.Min2YR(time);
                            System.out.println(time + " years");
                            break;

                        // Hour
                        case "hr2ms":
                            time = Hour.HR2MS(time);
                            System.out.println((int)time + " ms");
                            break;

                        case "hr2sec":
                            time = Hour.HR2Sec(time);
                            System.out.println((int)time + " seconds");
                            break;

                        case "hr2min":
                            time = Hour.HR2Min(time);
                            System.out.println((int)time + " minutes");
                            break;

                        case "hr2day":
                            time = Hour.HR2Day(time);
                            System.out.println(time + " days");
                            break;

                        case "hr2wk":
                            time = Hour.HR2WK(time);
                            System.out.println(time + " weeks");
                            break;

                        case "hr2yr":
                            time = Hour.HR2YR(time);
                            System.out.println(time + " years");
                            break;

                        // Day
                        case "day2ms":
                            time = Day.Day2MS(time);
                            System.out.println((int)time + " ms");
                            break;

                        case "day2sec":
                            time = Day.Day2Sec(time);
                            System.out.println((int)time + " seconds");
                            break;

                        case "day2min":
                            time = Day.Day2Min(time);
                            System.out.println((int)time + " minutes");
                            break;

                        case "day2hr":
                            time = Day.Day2HR(time);
                            System.out.println((int)time + " hours");
                            break;

                        case "day2wk":
                            time = Day.Day2WK(time);
                            System.out.println(time + " weeks");
                            break;

                        case "day2yr":
                            time = Day.Day2YR(time);
                            System.out.println(time + " years");
                            break;

                        // Week
                        case "wk2ms":
                            time = Week.WK2MS(time);
                            System.out.println((int)time + " ms");
                            break;

                        case "wk2sec":
                            time = Week.WK2Sec(time);
                            System.out.println((int)time + " seconds");
                            break;

                        case "wk2min":
                            time = Week.WK2Min(time);
                            System.out.println((int)time + " minutes");
                            break;

                        case "wk2hr":
                            time = Week.WK2HR(time);
                            System.out.println((int)time + " hours");
                            break;

                        case "wk2day":
                            time = Week.WK2Day(time);
                            System.out.println((int)time + " days");
                            break;

                        case "wk2yr":
                            time = Week.WK2YR(time);
                            System.out.println(time + " years");
                            break;

                        // Year
                        case "yr2ms":
                            time = Year.YR2MS(time);
                            System.out.println((int)time + " ms");
                            break;

                        case "yr2sec":
                            time = Year.YR2Sec(time);
                            System.out.println((int)time + " seconds");
                            break;

                        case "yr2min":
                            time = Year.YR2Min(time);
                            System.out.println((int)time + " minutes");
                            break;

                        case "yr2hr":
                            time = Year.YR2WK(time);
                            System.out.println((int)time + " hours");
                            break;

                        case "yr2day":
                            time = Year.YR2Day(time);
                            System.out.println((int)time + " days");
                            break;

                        case "yr2wk":
                            time = Year.YR2WK(time);
                            System.out.println((int)time + " weeks");
                            break;
                    
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;

                case "leng":
                    System.out.println("Which data do you want to convert to?");
                    System.out.println("Centimetre to Millimetre: cm2mm");
                    System.out.println("Centimetre to Meter: cm2m");
                    System.out.println("Centimetre to Kilometer: cm2km");
                    System.out.println("Centimetre to Inch: cm2in");
                    System.out.println("Centimetre to Foot: cm2ft");
                    System.out.println("Centimetre to Yard: cm2yd");
                    System.out.println("Centimetre to Mile: cm2mi");
                    System.out.println("Centimetre to Nautical Mile: cm2nm");
                    System.out.println("Millimetre to Centimetre: mm2cm");
                    System.out.println("Millimetre to Meter: mm2m");
                    System.out.println("Millimetre to Kilometer: mm2km");
                    System.out.println("Millimetre to Inch: mm2in");
                    System.out.println("Millimetre to Foot: mm2ft");
                    System.out.println("Millimetre to Yard: mm2yd");
                    System.out.println("Millimetre to Mile: mm2mi");
                    System.out.println("Millimetre to Nautical Mile: mm2nm");
                    System.out.println("Meter to Centimetre: m2cm");
                    System.out.println("Meter to Millimetre: m2mm");
                    System.out.println("Meter to Kilometer: m2km");
                    System.out.println("Meter to Inch: m2in");
                    System.out.println("Meter to Foot: m2ft");
                    System.out.println("Meter to Yard: m2yd");
                    System.out.println("Meter to Mile: m2mi");
                    System.out.println("Meter to Nautical Mile: m2nm");
                    System.out.println("Kilometer to Centimetre: km2cm");
                    System.out.println("Kilometer to Millimetre: km2mm");
                    System.out.println("Kilometer to Meter: km2m");
                    System.out.println("Kilometer to Inch: km2in");
                    System.out.println("Kilometer to Foot: km2ft");
                    System.out.println("Kilometer to Yard: km2yd");
                    System.out.println("Kilometer to Mile: km2mi");
                    System.out.println("Kilometer to Nautical Mile: km2nm");
                    System.out.println("Inch to Centimetre: in2cm");
                    System.out.println("Inch to Millimetre: in2mm");
                    System.out.println("Inch to Meter: in2m");
                    System.out.println("Inch to Kilometer: in2km");
                    System.out.println("Inch to Foot: in2ft");
                    System.out.println("Inch to Yard: in2yd");
                    System.out.println("Inch to Mile: in2mi");
                    System.out.println("Inch to Nautical Mile: in2nm");
                    System.out.println("Foot to Centimetre: ft2cm");
                    System.out.println("Foot to Millimetre: ft2mm");
                    System.out.println("Foot to Meter: ft2m");
                    System.out.println("Foot to Kilometer: ft2km");
                    System.out.println("Foot to Inch: ft2in");
                    System.out.println("Foot to Yard: ft2yd");
                    System.out.println("Foot to Mile: ft2mi");
                    System.out.println("Foot to Nautical Mile: ft2nm");
                    System.out.println("Yard to Centimetre: yd2cm");
                    System.out.println("Yard to Millimetre: yd2mm");
                    System.out.println("Yard to Meter: yd2m");
                    System.out.println("Yard to Kilometer: yd2km");
                    System.out.println("Yard to Inch: yd2in");
                    System.out.println("Yard to Foot: yd2ft");
                    System.out.println("Yard to Mile: yd2mi");
                    System.out.println("Yard to Nautical Mile: yd2nm");
                    System.out.println("Mile to Centimetre: mi2cm");
                    System.out.println("Mile to Millimetre: mi2mm");
                    System.out.println("Mile to Meter: mi2m");
                    System.out.println("Mile to Kilometer: mi2km");
                    System.out.println("Mile to Inch: mi2in");
                    System.out.println("Mile to Foot: mi2ft");
                    System.out.println("Mile to Yard: mi2yd");
                    System.out.println("Mile to Nautical Mile: mi2nm");
                    System.out.println("Nautical Mile to Centimetre: nm2cm");
                    System.out.println("Nautical Mile to Millimetre: nm2mm");
                    System.out.println("Nautical Mile to Meter: nm2m");
                    System.out.println("Nautical Mile to Kilometer: nm2km");
                    System.out.println("Nautical Mile to Inch: nm2in");
                    System.out.println("Nautical Mile to Foot: nm2ft");
                    System.out.println("Nautical Mile to Yard: nm2yd");
                    System.out.println("Nautical Mile to Mile: nm2mi");
                    System.out.println();
                    String lengConvertRate = input.nextLine();
                    System.out.println("OK\nType it in: ");
                    double length = input.nextDouble();
                    input.nextLine();
                    
                    switch (lengConvertRate.toLowerCase()) {
                        // Centimetre
                        case "cm2mm":
                            length = Centimetre.CM2MM(length);
                            System.out.println(length +"mm");
                            break;

                        case "cm2m":
                            length = Centimetre.CM2M(length);
                            System.out.println(length +"m");
                            break;

                        case "cm2km":
                            length = Centimetre.CM2KM(length);
                            System.out.println(length +"km");
                            break;

                        case "cm2in":
                            length = Centimetre.CM2IN(length);
                            System.out.println(length +"in");
                            break;

                        case "cm2ft":
                            length = Centimetre.CM2FT(length);
                            System.out.println(length +"ft");
                            break;

                        case "cm2yd":
                            length = Centimetre.CM2YD(length);
                            System.out.println(length +"yd");
                            break;

                        case "cm2mi":
                            length = Centimetre.CM2MI(length);
                            System.out.println(length +"mi");
                            break;

                        case "cm2nm":
                            length = Centimetre.CM2NM(length);
                            System.out.println(length +"nm");
                            break;

                        // Feet
                        case "ft2mm":
                            length = Feet.FT2MM(length);
                            System.out.println(length + "mm");
                            break;

                        case "ft2cm":
                            length = Feet.FT2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "ft2m":
                            length = Feet.FT2M(length);
                            System.out.println(length + "m");
                            break;

                        case "ft2km":
                            length = Feet.FT2KM(length);
                            System.out.println(length + "km");
                            break;

                        case "ft2in":
                            length = Feet.FT2IN(length);
                            System.out.println(length + "in");
                            break;

                        case "ft2yd":
                            length = Feet.FT2YD(length);
                            System.out.println(length + "yd");
                            break;

                        case "ft2mi":
                            length = Feet.FT2MI(length);
                            System.out.println(length + "mi");
                            break;

                        case "ft2nm":
                            length = Feet.FT2NM(length);
                            System.out.println(length + "nm");
                            break;

                        // Inch
                        case "in2mm":
                            length = Inch.IN2MM(length);
                            System.out.println(length + "mm");
                            break;

                        case "in2cm":
                            length = Inch.IN2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "in2m":
                            length = Inch.IN2M(length);
                            System.out.println(length + "m");
                            break;

                        case "in2km":
                            length = Inch.IN2KM(length);
                            System.out.println(length + "km");
                            break;

                        case "in2ft":
                            length = Inch.IN2FT(length);
                            System.out.println(length + "ft");
                            break;

                        case "in2yd":
                            length = Inch.IN2YD(length);
                            System.out.println(length + "yd");
                            break;

                        case "in2mi":
                            length = Inch.IN2MI(length);
                            System.out.println(length + "mi");
                            break;

                        case "in2nm":
                            length = Inch.IN2NM(length);
                            System.out.println(length + "nm");
                            break;

                        // Kilometre
                        case "km2mm":
                            length = Kilometre.KM2MM(length);
                            System.out.println(length + "mm");
                            break;

                        case "km2cm":
                            length = Kilometre.KM2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "km2m":
                            length = Kilometre.KM2M(length);
                            System.out.println(length + "m");
                            break;

                        case "km2in":
                            length = Kilometre.KM2IN(length);
                            System.out.println(length + "in");
                            break;

                        case "km2ft":
                            length = Kilometre.KM2FT(length);
                            System.out.println(length + "ft");
                            break;

                        case "km2yd":
                            length = Kilometre.KM2YD(length);
                            System.out.println(length + "yd");
                            break;

                        case "km2mi":
                            length = Kilometre.KM2MI(length);
                            System.out.println(length + "mi");
                            break;

                        case "km2nm":
                            length = Kilometre.KM2NM(length);
                            System.out.println(length + "nm");
                            break;

                        //Metre
                        case "m2mm":
                            length = Metre.M2MM(length);
                            System.out.println(length + "mm");
                            break;

                        case "m2cm":
                            length = Metre.M2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "m2km":
                            length = Metre.M2KM(length);
                            System.out.println(length + "km");
                            break;

                        case "m2in":
                            length = Metre.M2IN(length);
                            System.out.println(length + "in");
                            break;

                        case "m2ft":
                            length = Metre.M2FT(length);
                            System.out.println(length + "ft");
                            break;
                        
                        case "m2yd":
                            length = Metre.M2YD(length);
                            System.out.println(length + "yd");
                            break;
                        
                        case "m2mi":
                            length = Metre.M2MI(length);
                            System.out.println(length + "mi");
                            break;
                        
                        case "m2nm":
                            length = Metre.M2NM(length);
                            System.out.println(length + "nm");
                            break;

                        //Mile
                        case "mi2mm":
                            length = Mile.MI2MM(length);
                            System.out.println(length + "mm");
                            break;

                        case "mi2cm":
                            length = Mile.MI2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "mi2m":
                            length = Mile.MI2M(length);
                            System.out.println(length + "m");
                            break;

                        case "mi2km":
                            length = Mile.MI2KM(length);
                            System.out.println(length + "km");
                            break;

                        case "mi2in":
                            length = Mile.MI2IN(length);
                            System.out.println(length + "in");
                            break;

                        case "mi2ft":
                            length = Mile.MI2FT(length);
                            System.out.println(length + "ft");
                            break;
                        
                        case "mi2yd":
                            length = Mile.MI2YD(length);
                            System.out.println(length + "yd");
                            break;
                        
                        case "mi2nm":
                            length = Mile.MI2NM(length);
                            System.out.println(length + "nm");
                            break;

                        // Millimetre
                        case "mm2cm":
                            length = Millimetre.MM2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "mm2m":
                            length = Millimetre.MM2M(length);
                            System.out.println(length + "m");
                            break;

                        case "mm2km":
                            length = Millimetre.MM2KM(length);
                            System.out.println(length + "km");
                            break;

                        case "mm2in":
                            length = Millimetre.MM2IN(length);
                            System.out.println(length + "in");
                            break;

                        case "mm2ft":
                            length = Millimetre.MM2FT(length);
                            System.out.println(length + "ft");
                            break;

                        case "mm2yd":
                            length = Millimetre.MM2YD(length);
                            System.out.println(length + "yd");
                            break;

                        case "mm2mi":
                            length = Millimetre.MM2MI(length);
                            System.out.println(length + "mi");
                            break;

                        case "mm2nm":
                            length = Millimetre.MM2NM(length);
                            System.out.println(length + "nm");
                            break;

                        // Nuatical Mile
                        case "nm2mm":
                            length = NautMile.NM2MM(length);
                            System.out.println(length + "mm");
                            break;

                        case "nm2cm":
                            length = NautMile.NM2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "nm2m":
                            length = NautMile.NM2M(length);
                            System.out.println(length + "m");
                            break;

                        case "nm2km":
                            length = NautMile.NM2KM(length);
                            System.out.println(length + "km");
                            break;

                        case "nm2in":
                            length = NautMile.NM2IN(length);
                            System.out.println(length + "in");
                            break;

                        case "nm2ft":
                            length = NautMile.NM2FT(length);
                            System.out.println(length + "ft");
                            break;

                        case "nm2yd":
                            length = NautMile.NM2YD(length);
                            System.out.println(length + "yd");
                            break;

                        case "nm2mi":
                            length = NautMile.NM2MI(length);
                            System.out.println(length + "mi");
                            break;

                        // Yard
                        case "yd2mm":
                            length = Yard.YD2MM(length);
                            System.out.println(length + "mm");
                            break;
                        
                        case "yd2cm":
                            length = Yard.YD2CM(length);
                            System.out.println(length + "cm");
                            break;

                        case "yd2m":
                            length = Yard.YD2M(length);
                            System.out.println(length + "m");
                            break;

                        case "yd2km":
                            length = Yard.YD2KM(length);
                            System.out.println(length + "km");
                            break;

                        case "yd2in":
                            length = Yard.YD2IN(length);
                            System.out.println(length + "in");
                            break;

                        case "yd2ft":
                            length = Yard.YD2FT(length);
                            System.out.println(length + "ft");
                            break;

                        case "yd2nm":
                            length = Yard.YD2NM(length);
                            System.out.println(length + "nm");
                            break;

                        case "yd2mi":
                            length = Yard.YD2MI(length);
                            System.out.println(length + "mi");
                            break;
                    
                        default:
                            System.out.println("Invalid unit type. Please try again.");
                            break;
                    }

                default:
                    System.out.println("Invalid unit type. Please try again.");
                    break;
            }

            System.out.println("Do you still want to convert? Type 'no' to exit.");
            command = input.nextLine();
            if (!command.equalsIgnoreCase("no")) {
                System.out.println("Which unit do you want to convert?");
                System.out.println("Temperature: temp");
                System.out.println("Data: data");
                System.out.println("Time: time");
                System.out.println("Mass: mass");
                command = input.nextLine();
            }
        }

        System.out.println("Thank you for using our application.");
    }
}
