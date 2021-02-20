import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Practice {

        public static void main(String[] args)
        {
            String zadannayaStroka = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                    "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                    "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                    "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                    "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                    "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
            int k = 10;



            System.out.println(encrypt(zadannayaStroka,zadannayaStroka.length(), k));


        }

        private static String encrypt(String str, int length, int shift)
        {
            StringBuilder strBuilder = new StringBuilder();
            char c;
            for (int i = 0; i < length; i++)
            {
                c = str.charAt(i);
                // if c is letter ONLY then shift them, else directly add it
                if (Character.isLetter(c))
                {
                    c = (char) (str.charAt(i) + shift);
                    // System.out.println(c);

                    // checking case or range check is important, just if (c > 'z'
                    // || c > 'Z')
                    // will not work
                    if ((Character.isLowerCase(str.charAt(i)) && c > 'я')
                            || (Character.isUpperCase(str.charAt(i)) && c > 'Я'))
if(str.charAt(i)=='р') c='ё';
                        c = (char) (str.charAt(i) - (33 - shift));
                }
                strBuilder.append(c);
            }
            return strBuilder.toString();
        }
    }

