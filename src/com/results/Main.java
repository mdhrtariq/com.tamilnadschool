package com.results;

public class Main
{
    public static void main(String[] args)
    {
        int num = 6;

        double ss[] = new double[num];
        double gg[] = new double[num];
        double cgpa, sum = 0;
 ss[0] = 55;
 ss[1] = 92;
 ss[2] = 95;
 ss[3] = 85;
 ss[4] = 55;
 ss[5] =25;
double tamil = ss[0];
double english = ss[1];
double maths = ss[2];
double science = ss[3];
double social = ss[4];
double compScience = ss[5];
String CGPA1 = "E Grade Fail" ;
String CGPA2 = "D Grade Pass";
String CGPA3 = "C Grade Pass";
String CGPA4 = "B Grade Pass";
String CGPA5 = "A Grade Pass";
String CGPA6 = "A+ Grade Pass";



        for (int i = 0; i < num; i++)
        {
            gg[i] = (ss[i] / 10);
        }
        for (int i = 0; i < num; i++) {
            sum += gg[i];
        }
        cgpa = sum / num;
        System.out.println("CGPA = " + cgpa);
        System.out.println("percantage from CGPA = " + cgpa * 9.5);
        {
            System.out.println("Average:  "+(tamil+english+maths+science+social)/5);
            System.out.println("Tamil:  "+tamil);
        }
        if(ss[0] >=1 && ss[0] <50)
        {
            System.out.println("Grade:"+ 5.0);
        }
        else if (ss[0] >=50 && ss[0]<60)
        {
            System.out.println("Grade:"+6.0);
        }
        else if (ss[0]>60 && ss[0]<70)
        {
            System.out.println("Grade:"+7.0);
        }
        else if (ss[0] >70 && ss[0] <80)
        {
            System.out.println("Grade:"+8.0);
        }
        else if (ss[0]>80 && ss[0]<90)
        {
            System.out.println("Grade:"+9.0);
        }
        else if (ss[0] >90 && ss[0] <100)
        {
            System.out.println("Grade:"+10.0);
        }
        else if(ss[0] >100)
        {
            System.out.println("invalid");
        }

        if(tamil >=1 && tamil <50)
    {
        System.out.println(CGPA1);
    }
    else if(tamil >= 50 && tamil < 60)
    {
        System.out.println(CGPA2);
    }
    else if (tamil >60 && tamil <70)
    {
        System.out.println(CGPA3);
    }
    else if(tamil >70 && tamil <80)
    {
        System.out.println(CGPA4);
    }
    else if(tamil >80 && tamil <90)
    {
        System.out.println(CGPA5);
    }
    else if(tamil >90 && tamil <100)
    {
        System.out.println(CGPA6);
    }
    else if(tamil >100)
    {
        System.out.println("invalid");
    }
    else if(tamil <=0)
        {
            System.out.println("absent");
        }
        if(ss[1] >=1 && ss[1] <50)
        {
            System.out.println("Grade:"+ 5.0);
        }
        else if (ss[1] >=50 && ss[1]<60)
        {
            System.out.println("Grade:"+6.0);
        }
        else if (ss[1]>60 && ss[1]<70)
        {
            System.out.println("CGPA:"+7.0);
        }
        else if (ss[1] >70 && ss[1] <80)
        {
            System.out.println("Grade:"+8.0);
        }
        else if (ss[1]>80 && ss[1]<90)
        {
            System.out.println("Grade:"+9.0);
        }
        else if (ss[1] >90 && ss[1] <100)
        {
            System.out.println("Grade:"+10.0);
        }
        else if(ss[1] >100)
        {
            System.out.println("invalid");
        }
        {
            System.out.println("English:  "+english);
        }
        if(english >=1 && english <50)
        {
            System.out.println(CGPA1);
        }
        else if(english >= 50 && english < 60)
        {
            System.out.println(CGPA2);
        }
        else if (english >60 && english <70)
        {
            System.out.println(CGPA3);
        }
        else if(english >70 && english <80)
        {
            System.out.println(CGPA4);
        }
        else if(english >80 && english <90)
        {
            System.out.println(CGPA5);
        }
        else if(english >90 && english <100)
        {
            System.out.println(CGPA6);
        }
        else if(english >100)
        {
            System.out.println("invalid");
        }
        else if(english <=0)
        {
            System.out.println("absent");
        }
        if(ss[2] >=1 && ss[2] <50)
        {
            System.out.println("Grade:"+ 5.0);
        }
        else if (ss[2] >=50 && ss[2]<60)
        {
            System.out.println("Grade:"+6.0);
        }
        else if (ss[2]>60 && ss[2]<70)
        {
            System.out.println("Grade:"+7.0);
        }
        else if (ss[2] >70 && ss[2] <80)
        {
            System.out.println("Grade:"+8.0);
        }
        else if (ss[2]>80 && ss[2]<90)
        {
            System.out.println("Grade:"+9.0);
        }
        else if (ss[2] >90 && ss[2] <100)
        {
            System.out.println("Grade:"+10.0);
        }
        else if(ss[2] >100)
        {
            System.out.println("invalid");
        }

        {
            System.out.println("Maths:  "+maths);
        }
        if(maths >=1 && maths <50)
        {
            System.out.println(CGPA1);
        }
        else if(maths >= 50 && maths < 60)
        {
            System.out.println(CGPA2);
        }
        else if (maths >60 && maths <70)
        {
            System.out.println(CGPA3);
        }
        else if(maths >70 && maths <80)
        {
            System.out.println(CGPA4);
        }
        else if(maths >80 && maths <90)
        {
            System.out.println(CGPA5);
        }
        else if(maths >90 && maths <100)
        {
            System.out.println(CGPA6);
        }
        else if(maths >100)
        {
            System.out.println("invalid");
        }
        else if(maths <=0)
        {
            System.out.println("absent");
        }
        if(ss[3] >=1 && ss[3] <50)
        {
            System.out.println("Grade:"+ 5.0);
        }
        else if (ss[3] >=50 && ss[3]<60)
        {
            System.out.println("Grade:"+6.0);
        }
        else if (ss[3]>60 && ss[3]<70)
        {
            System.out.println("Grade:"+7.0);
        }
        else if (ss[3] >70 && ss[3] <80)
        {
            System.out.println("Grade:"+8.0);
        }
        else if (ss[3]>80 && ss[3]<90)
        {
            System.out.println("Grade:"+9.0);
        }
        else if (ss[3] >90 && ss[3] <100)
        {
            System.out.println("Grade:"+10.0);
        }
        else if(ss[3] >100)
        {
            System.out.println("invalid");
        }

        {
            System.out.println("Science:  "+science);
        }
        if(science >=1 && science <50)
        {
            System.out.println(CGPA1);
        }
        else if(science >= 50 && science < 60)
        {
            System.out.println(CGPA2);
        }
        else if (science >60 && science <70)
        {
            System.out.println(CGPA3);
        }
        else if(science >70 && science <80)
        {
            System.out.println(CGPA4);
        }
        else if(science >80 && science <90)
        {
            System.out.println(CGPA5);
        }
        else if(science >90 && science <100)
        {
            System.out.println(CGPA6);
        }
        else if(science >100)
        {
            System.out.println("invalid");
        }
        else if(science <=0)
        {
            System.out.println("absent");
        }
        if(ss[4] >=1 && ss[4] <50)
        {
            System.out.println("Grade:"+5.0);
        }
        else if (ss[4] >=50 && ss[4]<60)
        {
            System.out.println("Grade:"+6.0);
        }
        else if (ss[4]>60 && ss[4]<70)
        {
            System.out.println("Grade:"+7.0);
        }
        else if (ss[4] >70 && ss[4] <80)
        {
            System.out.println("Grade:"+8.0);
        }
        else if (ss[4]>80 && ss[4]<90)
        {
            System.out.println("Grade:"+9.0);
        }
        else if (ss[4] >90 && ss[4] <100)
        {
            System.out.println("Grade:"+10.0);
        }
        else if(ss[4] >100)
        {
            System.out.println("invalid");
        }

        {
            System.out.println("Social:  "+social);
        }
        if(social >=1 && social <50)
        {
            System.out.println(CGPA1);
        }
        else if(social >= 50 && social < 60)
        {
            System.out.println(CGPA2);
        }
        else if (social >60 && social <70)
        {
            System.out.println(CGPA3);
        }
        else if(social >70 && social <80)
        {
            System.out.println(CGPA4);
        }
        else if(social >80 && social <90)
        {
            System.out.println(CGPA5);
        }
        else if(social >90 && social <100)
        {
            System.out.println(CGPA6);
        }
        else if(social >100)
        {
            System.out.println("invalid");
        }
        else if(social <=0)
        {
            System.out.println("absent");
        }
        {
            System.out.println("compScience:  "+compScience);
        }
        if(compScience >=1 && compScience <50)
        {
            System.out.println(CGPA1);
        }
        else if(compScience >= 50 && compScience < 60)
        {
            System.out.println(CGPA2);
        }
        else if (compScience >60 && compScience <70)
        {
            System.out.println(CGPA3);
        }
        else if(compScience >70 && compScience <80)
        {
            System.out.println(CGPA4);
        }
        else if(compScience >80 && compScience <90)
        {
            System.out.println(CGPA5);
        }
        else if(compScience >90 && compScience <100)
        {
            System.out.println(CGPA6);
        }
        else if(compScience >100)
        {
            System.out.println("invalid");
        }
        else if(compScience <=0)
        {
            System.out.println("absent");
        }
        if(ss[5] >=1 && ss[5] <50)
        {
            System.out.println("Grade:"+5.0);
        }
        else if (ss[5] >=50 && ss[5]<60)
        {
            System.out.println("Grade:"+6.0);
        }
        else if (ss[5]>60 && ss[5]<70)
        {
            System.out.println("Grade:"+7.0);
        }
        else if (ss[5] >70 && ss[5] <80)
        {
            System.out.println("Grade:"+8.0);
        }
        else if (ss[5]>80 && ss[5]<90)
        {
            System.out.println("Grade:"+9.0);
        }
        else if (ss[5] >90 && ss[5] <100)
        {
            System.out.println("Grade:"+10.0);
        }
        else if(ss[5] >100)
        {
            System.out.println("invalid");
        }
        else if(compScience <=0)
        {
            System.out.println("absent");
        }
    }
}
