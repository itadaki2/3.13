fun main() {
    print("введите четырехзначное число: ")
    val chislo = readLine()!!.toInt()

    val tysyachi = chislo / 1000 // вычисление тысяч
    val sotni = (chislo % 1000) / 100 // вычисление сотен
    val desyatki = (chislo % 100) / 10 // вычисление десятков
    val edinicy = chislo % 10 // вычисление единиц

    // суммы первых и последних цифр
    val summapervyh = tysyachi + sotni
    val summaposlednih = desyatki + edinicy
    if (summapervyh == summaposlednih) {
        println("сумма первых двух цифр равна сумме последних двух цифр")
    } else {
        println("сумма первых двух цифр не равна сумме последних двух цифр")
    }

    // кратност суммы цифр 3
    val summacifr = tysyachi + sotni + desyatki + edinicy
    if (summacifr % 3 == 0) {
        println("сумма цифр кратна 3")
    } else {
        println("сумма цифр не кратна 3")
    }

    // кратност произведения цифр 4
    val proizvedeniecifr = tysyachi * sotni * desyatki * edinicy
            if (proizvedeniecifr % 4 == 0) {
                println("произведение цифр кратно 4")
            } else {
                println("произведение цифр не кратно 4")
            }

    print("введите число a: ")
    val a = readLine()!!.toInt()

    // кратност произведения цифр a
    if (proizvedeniecifr % a == 0) {
        println("произведение цифр кратно: $a")
    } else {
        println("произведение цифр не кратно: $a")
    }
}
