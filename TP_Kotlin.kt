

open class personne() {
    var nom, sexe, adresse: String
    var age: Int

    init {
        nom = "Gamer"
        sexe = "Masculin"
        adresse = "Katoy"
        age = 24
    }

   open fun personne(): Unit {

        println(" NOM : $nom\n SEXE: $sexe\n ADRESSE: $adresse\n AGE: $age ")

    }

    constructor(name : String, sexe:String,adresse:String, age:Int):this(){
        this.nom = name
        this.sexe = sexe
        this.adresse = adresse
        this.age = age
    }
    open fun  saisiePers():Unit{
        println("ENTRER VOTRE NOM COMPLET :")
        nom = readLine()!!
        println("ENTRER VOTRE SEXE :")
        sexe = readLine()!!
        println("ENTRER VOTRE VOTRE ADRESSE :")
        adresse = readLine()!!
        println("ENTRER VOTRE AGE :")
        age = readLine()!!.toInt()

    }


}

class pere:personne() {
    var tel: String = ""
    var nbenfant: Int = 0

    init {
        this.tel = "+243973697114"
        this.nbenfant = 34
    }
   override fun  saisiePers():Unit{
        println("QUEL EST VOTRE NOM COMPLET :")
        nom = readLine()!!
        println(" TON SEXE :")
        sexe = readLine()!!
        println("QUEL EST VOTRE ADRESSE COMPLETE :")
        adresse = readLine()!!
        println(" TON AGE :")
        age = readLine()!!.toInt()

    }


    fun printPere(): Unit {
         saisiePers()

        println(" PHONE : " + tel)
        println(" ENFANT  : " + nbenfant)
    }

}

class agent:personne(){
    var salaireB : Double = 0.0
    var poste : String = ""
    var hjr :  Double = 0.0
    var salaireNet :  Double = 0.0
    var tva :  Double = 0.0
    override fun printPers(): Unit {
         println("OVERRIDE DE PERSONNE")
        println(" NOM : " + nom)
        println(" SEXE : " + sexe)
        println(" ADRESSE : " + adresse)
        println(" AGE : " + age)

    }

    fun calSalaire():Double{

        salaireNet = salaireB - tva
        return salaireNet
    }
    override fun  saisiePers():Unit{
        println("QUEL EST VOTRE NOM COMPLET :")
        nom = readLine()!!
        println(" TON SEXE :")
        sexe = readLine()!!
        println("QUEL EST VOTRE ADRESSE COMPLETE :")
        adresse = readLine()!!
        println(" TON AGE :")
        age = readLine()!!.toInt()

    }

    fun printAgent():Unit{

        saisiePers()
        printPers()



        println(" SALAIRE NET  : " + calSalaire())
        println(" TVA  : " + tva)

    }



}



fun main(args: Array<String>){
      var p = personne()
    var agent = agent()
    var pere = pere()

    println("AFFICHAGE DEPUIS PERSONNE")
    p.personne()
    println("HERITAGE DE  LA CLASSE PERSONNE DANS AGENT")
    agent.tva = 34.5
    agent.salaireB = 140.50
    agent.printAgent()
    println(" TON SALAIRE EST :"+agent.calSalaire())

    
    println("HERITAGE DE  LA CLASSE PERSONNE DANS PERE")
    pere.printPere()



}

