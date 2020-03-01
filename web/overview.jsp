<%--
  Created by IntelliJ IDEA.
  User: angelolemmens
  Date: 01/03/2020
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <title>Toestel beheer - overzicht</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<header>
    <h1>Toestel beheer</h1>
    <nav>
        <ul>
            <li><a class="btn btn-default" href="index.html">Home</a></li>
            <li><a class="btn btn-default btn-active" href="overzicht.html">Overzicht</a></li>
            <li><a class="btn btn-default" href="toevoegen.html">Toevoegen</a></li>
        </ul>
    </nav>
    <div class="picture-header"></div>
</header>
<main>
    <section>
        <h2>Overzicht van alle toestellen</h2>
        <table>
            <thead>
            <tr>
                <td>Toestel naam</td>
                <td>Bouwjaar</td>
                <td>Leverancier</td>
                <td>Opslag</td>
                <td>Aantal in bezit</td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Legion</td>
                <td>2020</td>
                <td>Lenovo</td>
                <td>512</td>
                <td>8</td>
            </tr>
            <tr>
                <td colspan="3"></td>
                <td><b>Totaal</b></td>
                <td class="totaal">8</td>
            </tr>
            </tbody>
        </table>
    </section>
</main>
<footer>
    <p>Copyright © 2020 | Alle rechten voorbehouden. | Website door Angelo Lemmens </p>
</footer>
</body>
</html>