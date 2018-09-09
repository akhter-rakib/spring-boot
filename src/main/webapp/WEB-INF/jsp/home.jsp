<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css"/>
</head>
<body>
<div class="ui container">
    <div class="ui segment">
        <h2 align="center">registration Form</h2>
    </div>
    <div class="ui segment">
        <form class="ui form" action="createStudent" modelAttribute="student" method="post">
            <div class="field">
                <label>Name</label>
                <input type="text" name="name" placeholder="First Name">
            </div>
            <div class="field">
                <label>Roll</label>
                <input type="text" name="roll" placeholder="Roll">
            </div>
            <div class="field">
                <label>Password</label>
                <input type="password" name="password" placeholder="Password">
            </div>
            <button class="ui button" type="submit">Submit</button>
        </form>
    </div>
</div>
</body>
</html>