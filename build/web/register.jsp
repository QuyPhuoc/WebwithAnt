<%-- 
    Document   : register
    Created on : Nov 6, 2024, 12:29:44 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng Ký</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: linear-gradient(135deg, #667eea, #764ba2);
        }
        .login-container {
            width: 350px;
            padding: 40px 30px;
            background: #ffffff;
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
            text-align: center;
        }
        .login-container h2 {
            font-size: 24px;
            margin-bottom: 20px;
            color: #333333;
        }
        .login-container input[type="text"],
        .login-container input[type="password"],
        .login-container input[type="confirm-password"]{
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-sizing: border-box;
            font-size: 16px;
            transition: border-color 0.3s;
        }
        .login-container input[type="text"]:focus,
        .login-container input[type="password"]:focus, 
        .login-container input[type="password"]:focus{
            border-color: #764ba2;
            outline: none;
        }
        .login-container button {
            width: 100%;
            padding: 12px;
            border: none;
            background-color: #667eea;
            color: #ffffff;
            font-size: 18px;
            font-weight: bold;
            border-radius: 8px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .login-container button:hover {
            background-color: #5a67d8;
        }
        .login-container a {
            display: block;
            margin-top: 15px;
            color: #764ba2;
            text-decoration: none;
            font-size: 14px;
            transition: color 0.3s;
        }
        .login-container a:hover {
            color: #5a67d8;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Đăng Ký</h2>
        <form action="register" method="post">
            <input type="text" name="username" placeholder="Tên đăng nhập" required>
            <input type="password" name="password" placeholder="Mật khẩu" required>
            <input type="password" name="confirm-password" placeholder="Nhập lại mật khẩu" required>
            <button type="submit">Đăng Ký</button>
            <!--<a href="/forgot-password">Quên mật khẩu?</a>-->
        </form>
        
    </div>
</body>
</html>
