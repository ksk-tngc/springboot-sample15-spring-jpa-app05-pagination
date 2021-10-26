## 概要

Spring Data JPA でページネーションを実装したサンプルです。

以下の要素を含みます：
* Spring Data JPA で CRUD 操作
* バリデーション
* Thymeleaf Layout Dialect で共通レイアウト
* CommandLineRunner によるコマンドライン処理 (DB初期データ登録)
* Bootstrap, Bootstrap Icons (WebJars)


## 画面

#### ページネーション
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810249-e6fe7a50-cfeb-4d21-a2aa-2c6a18a6918d.png">  
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810337-8d1b4568-15aa-4b39-a494-73071022575e.png">  

#### 新規追加
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810431-81b472ab-5a57-4d15-89eb-40865220f3b3.png">  
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810492-98431682-3ce6-428b-90d3-db4c9deb52e2.png">  

#### 編集
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810734-445dd847-40ce-4795-8f89-08b5da19c07f.png">  
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810792-bd02c615-78b9-4943-ab77-60f4706c6028.png">  

#### 削除
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810879-1fa63e06-e7d3-4161-b149-b6579428851a.png">  
<img width="600" src="https://user-images.githubusercontent.com/59589496/138810921-a715c516-5e6b-4a54-80a6-d5fa0e2c64c1.png">  


## フォルダ構成

<img width="320" src="https://user-images.githubusercontent.com/59589496/138811379-770488fc-901c-4998-9107-60ff7bdbf85a.png">


## 依存関係

* Spring Boot DevTools
* Spring Web
* Thymeleaf
* Thymeleaf Layout Dialect
* Validation
* Spring Data JPA
* H2 Database
* Lombok
* WebJars
	- Webjars Locator Core
	- Bootstrap
	- Bootstrap Icons
