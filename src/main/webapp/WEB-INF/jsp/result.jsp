<%@page language="java" contentType="text/html; charset=utf-8"
        pageEncoding="utf-8"%>
<html>
<head>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<div class="container">
    <div class="page-header">
        <h1>
            计算器示例
        </h1>
    </div>
    <form method="post" action="addStudent.html">
        <div class="row clearfix">
            <div class="col-md-4 column">
                <div class="form-group">
                    <label for="language">语言代码</label>
                    <textarea class="form-control" id="language" name="language" rows="16">${language}</textarea>
                </div>
            </div>
            <div class="col-md-4 column">

                <div class="row clearfix">
                    <div class="col-md-4 column">

                    </div>
                    <div class="col-md-4 column">
                        <button type="submit" class="btn btn-primary" style="margin-top: 100px; margin-bottom: 80px">运行结果</button>
                    </div>
                    <div class="col-md-4 column">

                    </div>
                </div>

            </div>
            <div class="col-md-4 column">
                <form role="form">
                    <div class="form-group">
                        <label for="result">运行结果</label>
                        <textarea type="text" class="form-control" id="result" rows="8">${result}</textarea>
                        <label for="token">token</label>
                        <textarea type="text" class="form-control" id="token" rows="8">${token}</textarea>
                        <label for="prefix">逆波兰翻译</label>
                        <textarea type="text" class="form-control" id="prefix" rows="8">${prefix}</textarea>
                    </div>
                </form>
            </div>
        </div>
    </form>
</div>
</html>
