package app;

import java.time.LocalDate;
import java.time.Period;

public class HitungUmur {
    public static Period hitungUmur(LocalDate lahir, LocalDate hariIni) {
        return Period.between(lahir, hariIni);
    }

    public static LocalDate ulangTahunBerikutnya(LocalDate lahir, LocalDate hariIni) {
        LocalDate ulangTahun = lahir.withYear(hariIni.getYear());
        if (ulangTahun.isBefore(hariIni) || ulangTahun.isEqual(hariIni)) {
            ulangTahun = ulangTahun.plusYears(1);
        }
        return ulangTahun;
    }
}