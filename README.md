# Práctica 4.1 Lenguajes de descripción basados en XML

## Parte 1

Abre el proyecto *EjercicioXML* en Netbeans incluido en el repositorio y busca la forma de reparar el fichero XML de la ventana Principal (VentanaPrincipal.form)

## Parte 2

A partir del documento **XML** facilitado a continuación, se pide crear dos archivos **XSLT** distintos que ofrezcan dos páginas *HTML* que muestren los datos de manera distinta. Puedes hacer uso de un navegador que interprete XSLT como Firefox o desde esta web online desde un modelo de ejemplo <https://www.w3schools.com/xml/tryxslt.asp?xmlfile=cdcatalog&xsltfile=cdcatalog_apply>


```
<?xml version="1.0" encoding="utf-8"?> 
<?xml-stylesheet type = "text/xsl" href = "desayuno.xsl"?>

<menu_desayuno>
 <desayuno> 
  <pedido>Luis</pedido>
  <precio>6,50 €</precio> 
  <descripcion nombre='desayuno americano' > 
    <alimentos> 
     <alimento> tostadas </alimento> 
     <cantidad> 2 </cantidad> 
    </alimentos>
    <alimentos>
     <alimento> café largo </alimento> 
     <cantidad> 1 </cantidad> 
    </alimentos> 
    <alimentos>
     <alimento> mermelada </alimento> 
     <cantidad> 1 </cantidad> 
    </alimentos> 
    <alimentos>
     <alimento> mantequilla </alimento> 
     <cantidad> 1 </cantidad> 
    </alimentos>	
	<alimentos>
     <alimento> huevos revueltos </alimento> 
     <cantidad> 1 </cantidad> 
    </alimentos>
   </descripcion>
   <calorías>1000</calorías> 
 </desayuno> 
 <desayuno>
   <pedido>Victor</pedido>
   <precio>6,00 €</precio>   
   <descripcion nombre='desayuno Francés'>
    <alimentos> 
     <alimento> croissant </alimento> 
     <cantidad> 2 </cantidad> 
    </alimentos>
    <alimentos> 
     <alimento> café </alimento> 
     <cantidad> 1 </cantidad> 
    </alimentos>	
    <alimentos> 
     <alimento> miel </alimento> 
     <cantidad> 2 </cantidad> 
    </alimentos>
    <alimentos>
     <alimento> baguette </alimento> 
     <cantidad> 1 </cantidad> 
    </alimentos> 
   </descripcion>
   <calorías>800</calorías> 
 </desayuno>
</menu_desayuno>

```


## Parte 3 (opcional)

Descarga el programa **SVG-Edit** en Windows (o **Boxy SVG** en Linux) para crear un **icono** sencillo que utilizar en tu aplicación creada en Java-Swing previa, en formato *SVG*. Muestra el código XML generado con dicho programa.
