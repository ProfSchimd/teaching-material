<!DOCTYPE html>
    <html>
    <head>
        <title>Example</title>
    </head>
    <body>
        <!-- First PHP snippet -->
        <?php echo("Hi, I'm a PHP script!"); ?>

        <!-- Entering PHP mode example -->
        <p>
            Codice <code>HTML</code> <br>
            <?php echo("Codice <code>PHP</code>"); ?>
        </p>

        <!-- PHP Comments -->
        <?php
        echo("Segue un commento su riga <br>"); // Commento su riga
        echo("Altro commento su riga, usando # <br>"); # Commento su riga stile script
        echo("Segue un commento su più righe <br>"); /* Il commento può iniziare a metà riga
        e prosegue fino ad incontrare il PRIMO terminatore */
        ?>

        <!-- Variables -->
        <p>
        <?php
        $var = 'Alice';
        $Var = 'Bob';
        echo("$var, $Var");      // output: "Alice, Bob"
        ?>
        </p>

        <!-- Variable scope -->
        <?php
        // variabili fuori da qualsiasi blocco -> globali
        $a = 1;
        $b = 2;

        function Sum1()
        {
            global $a, $b;
            $b = $a + $b;
        }

        function Sum2()
        {
            $GLOBALS['b'] = $GLOBALS['a'] + $GLOBALS['b'];
        } 

        Sum1(); // 
        echo $b; // stampa 3
        echo("<br>");
        Sum2(); 
        echo($b); // stampa 4
        echo("<br>")
        ?>

        <!-- Variable type -->
        <?php
        $a_bool = true;   // a bool
        $a_str  = "foo";  // a string
        $a_str2 = 'foo';  // a string
        $an_int = 12;     // an int
        echo(get_debug_type($a_bool) . "<br>");
        echo(get_debug_type($a_str) . "<br>");
        ?>
    </body>
</html>