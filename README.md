
# 🌐 GlassFish Full Starter – Users REST API (Jakarta EE)

This is a full-profile Jakarta EE starter project built on **Payara Server 6.x** (GlassFish-based) using Maven. It provides a minimal but extensible REST API for managing users, returning both HTML and JSON responses.
 

## 📦 Features

- ✅ Jakarta EE 10 Full Profile
- ✅ REST API using JAX-RS
- ✅ CDI for dependency injection
- ✅ Enum handling (gender: MALE, FEMALE)
- ✅ HTML response rendering
- ✅ JSON media support
- ✅ Maven project (cleanly structured)
- ✅ Deployable to Payara Server Full 6+

 

  📁 Project Structure

 

glassfish-full-starter/
├── src/
│   ├── main/java/
│   │   ├── com.example/        # REST endpoint
│   │   ├── org.model/          # User class + enum
│   │   └── org.services/       # Business logic
│   └── main/webapp/
│       └── WEB-INF/web.xml     # Deployment descriptor
├── pom.xml

 

 

## 🚀 How to Run

### 🛠 Prerequisites
- JDK 11+
- Payara Full Server 6.x
- Eclipse IDE with Jakarta EE support
- Maven 3.8+

### 🔧 Setup in Eclipse

1. Clone this repo or download the ZIP.
2. Import project as **Existing Maven Project**.
3. Deploy to Payara Server.
4. Start server and test endpoints.

 

## 🌐 REST API Endpoints

### 🔹 Get All Users (HTML)

 

GET /api/users
Content-Type: text/html

 

### 🔹 Get User by Username (HTML)

```

GET /api/users/username/{username}

````

**Example**:
 url
http://localhost:8080/glassfish-full-starter/api/users/username/kwame_nk
 

### 🔹 Media Types Supported

* `text/html`
* `application/json` *(optional if enabled)*

 

## 📄 Model: User

 java
public class User {
   private String fullname;
   private String username;
   private int age;
   private String id;
   private Gender gender;
}
 

 java
public enum Gender {
   MALE, FEMALE
}
 

 

## 🧪 Example Response (HTML)

 html
<table>
  <tr><th>Full Name</th><td>Kwame Nk</td></tr>
  <tr><th>Username</th><td>kwame_nk</td></tr>
  <tr><th>Gender</th><td>MALE</td></tr>
</table>
 

 

## 👨‍💻 Author

**Prof Money**
Jakarta EE Dev | Cybersecurity Expert | Software Engineer
[GitHub](https://github.com/processor1)

---

## ⚖ License

This project is open-source under the [MIT License](LICENSE).

 

## 🌟 Star the Repo

If this project helped you get started with **Jakarta EE on Payara**, consider giving it a ⭐ on GitHub!

 
git clone https://github.com/processor1/glassfish-full-starter.git
 

 

 

Let me know if you want:

- A live demo hosted
- GitHub Actions CI/CD setup
- Swagger/OpenAPI integration
- Or a `LICENSE` file

Just say `root, add license` or `root, add Swagger` 💡
```
