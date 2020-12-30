package com.esime.pokedex.common;

public class Constantes {

    public static final String NUMBER_POKEMON = "numberPokemon";
    public static final String NAME_POKEMON = "namePokemon";
    public static final String APP_SETTING_FILE = "APP_SETTING";
    public static final String TAG = "POKEDEX";

    public static final String URL_POKEMON_TYPE_ACERO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/e/e1/latest/20191113212835/Tipo_acero.png/80px-Tipo_acero.png";
    public static final String URL_POKEMON_TYPE_AGUA  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/6/64/latest/20191113212835/Tipo_agua.png/80px-Tipo_agua.png";
    public static final String URL_POKEMON_TYPE_BICHO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/6/6e/latest/20191113212836/Tipo_bicho.png/80px-Tipo_bicho.png";
    public static final String URL_POKEMON_TYPE_DRAGON  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/c/cb/latest/20191113212836/Tipo_drag%C3%B3n.png/80px-Tipo_drag%C3%B3n.png";
    public static final String URL_POKEMON_TYPE_ELECTRICO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/5/5d/latest/20191113212836/Tipo_el%C3%A9ctrico.png/80px-Tipo_el%C3%A9ctrico.png";
    public static final String URL_POKEMON_TYPE_FANTASMA  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/5/5f/latest/20191113212837/Tipo_fantasma.png/80px-Tipo_fantasma.png";
    public static final String URL_POKEMON_TYPE_FUEGO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/a/a7/latest/20191113212837/Tipo_fuego.png/80px-Tipo_fuego.png";
    public static final String URL_POKEMON_TYPE_HADA  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/5/59/latest/20191113212837/Tipo_hada.png/80px-Tipo_hada.png";
    public static final String URL_POKEMON_TYPE_HIELO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/1/13/latest/20191113212837/Tipo_hielo.png/80px-Tipo_hielo.png";
    public static final String URL_POKEMON_TYPE_LUCHA  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/f/f9/latest/20191221233728/Tipo_lucha.png/80px-Tipo_lucha.png";
    public static final String URL_POKEMON_TYPE_NORMAL  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/c/c4/latest/20191221233818/Tipo_normal.png/80px-Tipo_normal.png";
    public static final String URL_POKEMON_TYPE_PLANTA  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/c/ca/latest/20191113212949/Tipo_planta.png/80px-Tipo_planta.png";
    public static final String URL_POKEMON_TYPE_PSIQUICO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/f/f5/latest/20191113212950/Tipo_ps%C3%ADquico.png/80px-Tipo_ps%C3%ADquico.png";
    public static final String URL_POKEMON_TYPE_ROCA  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/0/05/latest/20191113212950/Tipo_roca.png/80px-Tipo_roca.png";
    public static final String URL_POKEMON_TYPE_SINIESTRO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/5/5a/latest/20191113212950/Tipo_siniestro.png/80px-Tipo_siniestro.png";
    public static final String URL_POKEMON_TYPE_TIERRA  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/7/7d/latest/20191113212951/Tipo_tierra.png/80px-Tipo_tierra.png";
    public static final String URL_POKEMON_TYPE_VENENO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/9/92/latest/20191113212951/Tipo_veneno.png/80px-Tipo_veneno.png";
    public static final String URL_POKEMON_TYPE_VOLADOR  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/9/9d/latest/20191113212951/Tipo_volador.png/80px-Tipo_volador.png";
    public static final String URL_POKEMON_TYPE_DESCONOCIDO  = "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/8/8d/latest/20191128015251/Tipo_%3F%3F%3F.png/80px-Tipo_%3F%3F%3F.png";
    public static final String URL_POKEMON_HABILIDAD_FISICA  = "https://images.wikidexcdn.net/mwuploads/wikidex/0/0f/latest/20140504181227/Tipo_f%C3%ADsico.gif";
    public static final String URL_POKEMON_HABILIDAD_ESPECIAL  = "https://images.wikidexcdn.net/mwuploads/wikidex/9/9b/latest/20140504180925/Tipo_especial.gif";
    public static final String URL_POKEMON_HABILIDAD_ESTADO  = "https://images.wikidexcdn.net/mwuploads/wikidex/6/68/latest/20141020094029/Tipo_estado.gif";


public static String getTypePokemon(String type){

        if(type.equals("normal")){
            return URL_POKEMON_TYPE_NORMAL ; }

    else if (type.equals("fighting")){
            return URL_POKEMON_TYPE_LUCHA ;}

        else if(type.equals("flying")){
            return URL_POKEMON_TYPE_VOLADOR ;}

        else  if(type.equals("poison")){
            return URL_POKEMON_TYPE_VENENO;}

        else  if(type.equals("ground")){
            return  URL_POKEMON_TYPE_TIERRA;}

        else  if(type.equals( "rock")){
            return URL_POKEMON_TYPE_ROCA ;}

        else      if(type.equals("bug")){
            return URL_POKEMON_TYPE_BICHO ;}

        else      if(type.equals("ghost")){
            return URL_POKEMON_TYPE_FANTASMA ;}

        else     if(type.equals( "steel")){
            return URL_POKEMON_TYPE_ACERO ;}

        else   if(type.equals("fire")){
            return URL_POKEMON_TYPE_FUEGO ;}

        else  if(type.equals("water")){
            return URL_POKEMON_TYPE_AGUA ;}

        else  if(type.equals("grass")){
            return URL_POKEMON_TYPE_PLANTA ;}

        else  if(type.equals("electric")){
            return URL_POKEMON_TYPE_ELECTRICO ;}

        else  if(type.equals("psychic")){
            return URL_POKEMON_TYPE_PSIQUICO ;}

        else if(type.equals("ice")){
            return  URL_POKEMON_TYPE_HIELO;}

        else  if(type.equals( "dragon")){
            return URL_POKEMON_TYPE_DRAGON ;}

        else  if(type.equals( "dark")){
            return URL_POKEMON_TYPE_SINIESTRO ;}

        else  if(type.equals("fairy")){
            return  URL_POKEMON_TYPE_HADA;}

               else {
            return URL_POKEMON_TYPE_DESCONOCIDO;}

}

public static int getNumberUrl(String url){
    String[] urlPartes = url.split("/");
    return Integer.parseInt(urlPartes[urlPartes.length - 1]);
}

public static String getStringNumber(int number){
    String numero;
    if(number-9<=0){
        numero = "00"+number;
    }else if(number-99<=0){
        numero = "0"+number;
    }else{
        numero = Integer.toString(number);
    }

    return numero;
}

}
