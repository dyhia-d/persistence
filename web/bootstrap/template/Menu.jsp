<%@page contentType="text/html" pageEncoding="UTF-8"%>

<meta charset="utf-8">
<title>Arc'People</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Connexion à mon application">
<link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />
<!-- ci-dessous notre fichier CSS -->
<link rel="stylesheet" type="text/css" href="bootstrap/css/app.css" />

<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato:400,700,300" />
<script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<!--mise en forme ajtene-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<!--dropdown menu-->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"/>

<%
    String active = request.getParameter("url");
    //int nbEnregistrement = PersonneDAO.nbEnregistrements();

    String activeIndex = "", activeListePersonnes = "", activeAjouterPersonne = "", activeProfil = "", activeAide = "";

    if (active.equals("/indexAccueil.jsp")) {
        activeIndex = "class=\"active\"";
    } else if (active.equals("/listeDesPersonnes.jsp")) {
        activeListePersonnes = "class=\"active\"";
    } else if (active.equals("/ajouterPersonne.jsp")) {
        activeAjouterPersonne = "class=\"active\"";
    } else if (active.equals("/profil.jsp")) {
        activeProfil = "class=\"active\"";
    } else if (active.equals("/aideUtilisation.jsp")) {
        activeAide = "class=\"active\"";
    } else if (active.equals("/aideFAQ.jsp")) {
        activeAide = "class=\"active\"";
    } 
    
%>


<nav class="navbar navbar-default" style="border-radius:0 0 0 0">
    <div class="container-fluid" >
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            
            <!--a class="navbar-brand">Arc'People</a-->
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li <% out.println(activeIndex);%>><a href="indexAccueil.jsp">Accueil <span class="sr-only">(current)</span></a></li>
                <li <% out.println(activeListePersonnes);%>><a href="listeDesPersonnes.jsp">Liste des personnes</a></li>
                <li <% out.println(activeAjouterPersonne);%>><a href="ajouterPersonne.jsp">Ajouter des personnes</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li <% out.println(activeProfil);%>><a href="profil.jsp">Profil</a></li>
                <li <% out.println(activeAide);%> class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Aide <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="aideUtilisation.jsp">Utilisation</a></li>
                        <li><a href="aideFAQ.jsp">FAQ</a></li>
                    </ul>
                </li>
                <li><a href="ServletLogout">Déconnexion</a></li>
            </ul>

        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>               