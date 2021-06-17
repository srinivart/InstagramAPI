package com.srinivart;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class MyFirstAppApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyFirstAppApplication.class, args);
		System.out.println("hello");


		Download d = new Download();
		d.downloadAllImages();







	}

	}


/*

https://www.codercrunch.com/question/101501912/how-download-image-url-and-save-it-java
* */