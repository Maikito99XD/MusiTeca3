# MusiTeca3
Proyecto musiteca mike steel marín

Antes de hacer nada hay que tener en cuenta que en el proyecto se nos crean una serie de tablas en la base de datos,
nada más iniciar.

**Funcionamiento**

La página lo que hará será mostrar información sobre el genero de cada canción, el genero al que pertenece y la playlist, donde el usuario podrá crear objetos del tipo canción, genero y playlist, los cuales se guardarán en la base de datos, además de que los podrá editar y borrar además de los que ya existen en la base de datos.

**Comandos para entrar en cada sitio**

"/" entra en la raiz

"/admin" entra en lo que vendría ser siendo

**Cancion**

"/cancion/list" es para entrar al listado de las canciones creadas.

Donde nos dará varias opciones tanto de edición como de eliminar la canción

"/cancion/nuevaCancion" es para crear una nueva canción

**Genero**

**Cuidado con está parte con el genero**

"/genero/list" es para entrar al listado de los generos creados.

En esta parte tenemos la edición y la eliminación del genero, donde al eliminar el genero,
se eliminarán todas las canciones que pertenecen a ese genero.

"/genero/nuevoGenero" es para crear un nuevo genero.

**Playlist**

"/playlist/nuevaPlaylist" donde podremos crear una nueva playlist

"/playlist/list" donde listará las playlist y podremos editarlas y borrarlas.

**Menú principal**

En el menú principal nos saldrá un listado en el navbar donde nos saldrán varias opciones las cuales nos llevarán,
a la creación o listado de las playlist, las canciones y los generos.

**Admin**

En el admin que sería el menú del backend donde saldría una barra lateral con los formularios, listados, etc...

**Formularios**

Los formularios son simplemente para la creación, edición y borrado de el objeto que queramos. Donde se ha creado un,
formulario para la edición ya que el postmapping daba error a la hora de hacer el borrado de los objetos y por ello,
he creado un formulario a parte donde el usuario no podrá modificar nada si nos que es para que se de cuenta de lo que quiere borrar y si está seguro poder borrarlo y así nos ahorramos problemas de errores humanos. Y se borrará o
se actualizará en la base de datos.

**Listados**

Los listados son simplemente para que el usuario sepa lo que hay en la base de datos, donde podrá borrar y editar, tras pulsar la opción de borrar o editar le llevará al formulario pertinente para que pueda llevar a cabo la acción.

**Creación**

La creación de objetos(playlist, canciones, generos), se le pedirán los datos pertinentes de cada objeto al usuario donde le llevará al formulario de creación del objeto y tras rellenar todos los datos se insertará en la base de datos 