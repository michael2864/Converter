/*
Написать приложение которое производит конвертаций форматов Json <--> Yaml:
        на вход приложения в виде аргумента программы принимаем расположение директории где находятся файлы,
        если аргумент отсутствует то происходит анализ текущей папки

        валидируем формат (YAML, JSON)
        сохраняем полученный файл в папке converted (старое имя + новое расширение)
        результаты конвертации сохраняем в файле result.log в формате
        имя_файла -> новое_имя_файла, длительность конвертации, старый размер -> новый размер
        если конвертация не возможно надо записать что файл не сконвертировался
        Результатом должен быть jar file который надо приложить к ДЗ
        https://www.mockaroo.com/

        snakeyaml
        Gson
        Faster jackson

        json-map-yaml
        yaml-map-json
        mockarro json
        interface ??
*/
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.yaml.snakeyaml.Yaml;

import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import java.util.Map;
import org.json.JSONObject;
import com.google.gson.Gson;



public class Converter {

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        String result
        // если в имени файла есть точка и она не является первым символом в названии файла
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".")+1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
        if ( fileName.endsWith(".txt")) {

        }
    }

    public static <JSONObject> void main(String[] args) {
        if (args == null) {
          File t =  new File("./phoneBook.json");
            System.out.print(Converter.getFileExtension(t));
            JSONObject jsonObj = new JSONObject("{ \"f1\":\"v1\"}");
            Map<String, String> map = new Gson().fromJson(jsonObj.toString(),Map.class);
            System.out.println(map);
        }
    }
}

//endsWith()