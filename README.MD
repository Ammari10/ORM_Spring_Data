
<h4>Mapping Objet Relationnel (ORM), JPA, Hibernate, Spring Data </h4>
<h5> Spring.Data : </h5>
<p> Spring Data :
• Spring Data est un module de Spring qui a déjà créé des interfaces génériques et des implémentations génériques qui permettent de gérer les entités JPA.
• En utilisant Spring Data, vous n’aurez plus besoin de faire appel à l’objet EntityManager pour gérer la persitence. Spring Data le fait à votre place.
• Spring Data nous évite de créer les interfaces et les implémentation JPA de la couche DAO.
• Il suffit de créer une interface qui hérite de l’interface JPARepository pour hériter toutes les méthodes classiques qui permettent de gérer les entités JPA.
• En cas de besoin, vous avez la possibilité d’ajouter d’autres méthodes en les déclarant à l’intérieur de l’interface JPARepository, sans avoir besoin de les implémenter. Spring Data le fera à votre place</p>
<img src="Captures/img.png">

<h4> L'ensemble des Entités JPA : </h4>


<h8> L'Entité Patient </h8>
<img src="Captures/P.png">

<h8> L'Entité Medecin:</h8>
<img src="Captures/Med.png">

<h8> L'Entité RendezVous:</h8>
<img src="Captures/RDV.png">

<h8> L'Entité Consultation:</h8>
<img src="Captures/Cons.png">


<h5> L'ensemble des Repository  : </h5>

<h8> PatientRepository ::</h8>
<img src="Captures/PREP.png">

<h8> MedecinRepository ::</h8>
<img src="Captures/MedRep.png">

<h8> ConsultationRepository ::</h8>
<img src="Captures/CREP.png">

<h8> RendezVousRepository ::</h8>
<img src="Captures/RDVREP.png">



<h5> La Couche Service : </h5>
<img src="Captures/srv.png">

<h3>L'implémentation de L'interface IService : </h3>
<img src="Captures/SERVICE.png">
<img src="Captures/SERVICE 2.png">

<h5> Partie Web  : </h5>
<h6> Patient Controller : </h6>
<img src="Captures/CNT.png">

<h6> Hopital Application </h6>
<img src="Captures/App1.png">
<img src="Captures/App2.png">

<h6> Server Port </h6>

<img src="Captures/PORT.png">

<h6> Results</h6>
<img src="Captures/26.png">
<img src="Captures/23.png">
<img src="Captures/25.png">
<img src="Captures/27.png">
<img src="Captures/29.png">
<img src="Captures/30.png">
<img src="Captures/31.png">
<<img src="Captures/33.png">
<img src="Captures/32.png">

<img src="Captures/40.png">













