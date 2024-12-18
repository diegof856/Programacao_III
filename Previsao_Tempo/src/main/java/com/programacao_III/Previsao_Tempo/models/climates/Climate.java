package com.programacao_III.Previsao_Tempo.models.climates;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

// A classe Climate representa as condições climáticas de uma cidade, incluindo dados como temperatura,
// sensação térmica, pressão atmosférica e umidade. Esses dados são frequentemente
// retornados em APIs de previsões meteorológicas.
public class Climate {

    // O campo 'temperature' representa a temperatura atual da cidade.
    // A anotação @JsonProperty é usada para mapear o campo no JSON para o nome do atributo 'temperature' em Java.
    // A anotação @JsonAlias permite que o JSON utilize o nome 'temp' para o mesmo atributo.
    @JsonProperty("Temperatura")
    @JsonAlias({"temp"})
    private String temperature;

    // O campo 'feels_like' representa a sensação térmica da cidade.
    // A anotação @JsonProperty é usada para mapear o campo 'feels_like' no JSON para 'feels_like' em Java.
    @JsonProperty("Sensacao_Termica")
    @JsonAlias({"feels_like"})
    private String feels_like;

    // O campo 'temp_min' representa a temperatura mínima registrada na cidade.
    // O campo 'temp_max' representa a temperatura máxima registrada.
    @JsonProperty("Temperatura_Minima")
    @JsonAlias({"temp_min"})
    private String temp_min;

    @JsonProperty("Temperatura_Maxima")
    @JsonAlias({"temp_max"})
    private String temp_max;

    // O campo 'pressure' representa a pressão atmosférica.
    @JsonProperty("Pressao_Atmosferica")
    @JsonAlias({"pressure"})
    private String pressure;

    // O campo 'humidity' representa a umidade relativa do ar na cidade.
    @JsonProperty("Umidade_Relativa_Do_Ar")
    @JsonAlias({"humidity"})
    private String humidity;

    // O campo 'sea_level' representa a pressão atmosférica ao nível do mar.
    @JsonProperty("Pressao_Atmosferica_Ao_Nivel_Do_Mar")
    @JsonAlias({"sea_level"})
    private String sea_level;

    // O campo 'grnd_level' representa a pressão atmosférica ao nível da terra.
    @JsonProperty("Pressao_Atmosferica_Ao_Nivel_Da_Terra")
    @JsonAlias({"grnd_level"})
    private String grnd_level;

    // Construtor padrão necessário para a deserialização do JSON.
    // O Jackson precisa de um construtor sem parâmetros para instanciar a classe durante a deserialização.
    public Climate() {};

    // Construtor parametrizado para inicializar os campos com valores fornecidos.
    // Esse construtor permite criar um objeto 'Climate' com dados específicos de temperatura, sensação térmica,
    // pressão e umidade.
    public Climate(String temperature, String feels_like, String temp_min, String temp_max, String grnd_level, String sea_level, String humidity, String pressure) {
        this.temperature = temperature;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.grnd_level = grnd_level;
        this.sea_level = sea_level;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    // Métodos 'getters' que retornam as informações climáticas com sufixos adequados.
    // Estes métodos são usados para acessar as condições climáticas e retornam os valores com unidades correspondentes,
    // como graus Celsius (ºC) para temperatura e pressão atmosférica (hpa).

    // Retorna a temperatura com o sufixo "ºC"
    public String getTemperature() {
        return temperature + "ºC";
    }

    // Retorna a sensação térmica com o sufixo "ºC"
    public String getFeels_like() {
        return feels_like + "ºC";
    }

    // Retorna a temperatura mínima com o sufixo "ºC"
    public String getTemp_min() {
        return temp_min + "ºC";
    }

    // Retorna a temperatura máxima com o sufixo "ºC"
    public String getTemp_max() {
        return temp_max + "ºC";
    }

    // Retorna a pressão atmosférica com o sufixo "hpa"
    public String getPressure() {
        return pressure + "hpa";
    }

    // Retorna a umidade com o sufixo "%"
    public String getHumidity() {
        return humidity + "%";
    }

    // Retorna a pressão ao nível do mar com o sufixo "hpa"
    public String getSea_level() {
        return sea_level + "hpa";
    }

    // Retorna a pressão ao nível da terra com o sufixo "hpa"
    public String getGrnd_level() {
        return grnd_level + "hpa";
    }
}
