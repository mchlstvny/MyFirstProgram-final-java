public class AsciiArt {
    // Clouds (https://www.asciiart.eu/nature/clouds)
    public static final String CLOUDS = ANSIColors.BLUE_BOLD_BRIGHT + """                                               
                              _                                  
                            (`  ).                    _           
                            (     ).              .:(`  )`.       
                             _(       '`.          :(   .    )      
                         .=(`(      .   )     .--  `.  (    ) )      
                    ((    (..__.:'-'   .+(   )   ` _`  ) )                 
                `.     `(       ) )       (   .  )     (   )  ._   
                )      ` __.:'   )     (   (   ))     `-'.-(`  ) 
                )  )  ( )       --'       `- __.'         :(      )) 
                .-'  (_.'          .')                    `(    )  ))
                                (_  )                     ` __.:'          
                """ + "\u001B[0m";

    // Mrs. Milky (inspiration from @warp.dev on tiktok (https://www.tiktok.com/@warp.dev/video/7360762638193823022?is_from_webapp=1&sender_device=pc&web_id=7440500924684699157))
    public static final String MILKY = "\u001B[36;1m" + // Bright cyan for "Moo! Moo!"
        "              ---------\n" +
        "            < Moo! Moo! >\n" +
        "              ---------\n" +
        "\u001B[37;1m" + // Bright white for cow body
        "                      \u001B[37;1m^__^\u001B[37;1m  \n" + 
        "                      (\u001B[33;1moo\u001B[37;1m\u001B[33;1m\u001B[37;1m)\\_______  \n" +  // Yellow "oo" eyes
        "                      (__)\\       )\\/\\  \n" +
        "                         ||\u001B[37;1m----\u001B[35;1mw\u001B[37;1m||  \n" + // Pink "w"
        "                         ||     ||  \n" +
        "\u001B[42m" + // Green background for the ground
        "                                                       " + // Spaces for the ground
        "\u001B[0m"; // Reset colors

    // Mr. Barky (https://www.asciiart.eu/animals/dogs)
    public static final String BARKY = 
                "\u001B[33;1m" +
                "              -----------\n" +
                "            < Woof! Woof! >\n" +
                "              -----------\n" +
                "\u001B[37;1m" +  
                "           __\n" +
                "      (___()" + "\u001B[33;1m" + "'`;\n" +
                "\u001B[37;1m" + "      /,    /`\n" +
                "      \\\\ " + "\u001B[33;0m" + "\\\\\n" +
                "\u001B[42m" +
                "                                                       " +  // Spaces for the ground (green)
                "\u001B[0m";   // Reset colors
    
    // Captain Whiskers (https://www.asciiart.eu/animals/cats)
    public static final String WHISKERS =           
        "\033[1;31m" +
        "                      -----------\n" +
        "                    < Meow! Meow! >\n" +
        "                      -----------\u001B[0m\n" +  
        "        \\    /\\\n" +
        "         )  ( " + "\u001B[33;1m" + "'" + "\u001B[37;1m" + ")\n" + // Yellow eyes
        "        (  /  )\n" +
        "         \\(__)|\n" +
        "\u001B[42m" +
        "                                                       " +  // SPaces for the ground
        "\u001B[0m"; // Reset colors
    
    // Text to ASCII Art (https://www.asciiart.eu/text-to-ascii-art)
    public static final String HEHE = "\u001B[1;95m" +
                        " _  __         _                                 _ _       _      _      ____       _      _  __                   _           __  \n" + 
                        "| |/ /__ _ ___(_)  ___  __ _ _   _  __ _   _ __ (_) | __ _(_)    / \\    |  _ \\ __ _| | __ | |/ /__ _ ___ _ __ ___ (_)_ __   _  \\ \\ \n" + 
                        "| ' // _` / __| | / __|/ _` | | | |/ _` | | '_ \\| | |/ _` | |   / _ \\   | |_) / _` | |/ / | ' // _` / __| '_ ` _ \\| | '__| (_)  \\ \\\n" + 
                        "| . \\ (_| \\__ \\ | \\__ \\ (_| | |_| | (_| | | | | | | | (_| | |  / ___ \\  |  __/ (_| |   <  | . \\ (_| \\__ \\ | | | | | | |     _   / /\n" + 
                        "|_|\\_\\__,_|___/_| |___/\\__,_|\\__, |\\__,_| |_| |_|_|_|\\__,_|_| /_/   \\_\\ |_|   \\__,_|_|\\_\\ |_|\\_\\__,_|___/_| |_| |_|_|_|    (_) /_/ \n" + 
                        "                             |___/                                                                                                 " + "\u001B[0m";
}


