import  eu.mihosoft.vrl.v3d.ext.quickhull3d.*
import eu.mihosoft.vrl.v3d.Vector3d

//Move and rotate opperations
double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
CSG movedCube =  new Sphere(size).toCSG()
			.movex(-20)
			.movey(-40)
			.movez(60)
//This section is how you for a shape of the "shrinkwrap" of the 2 shapes. 
CSG hulledCubes = cube.union(movedCube).hull();

//Alternate way to perform a Hull
hulledCubes = CSG.hullAll([cube,movedCube])
def points = [	new Vector3d(10, 50, 10),
			new Vector3d(10, 40, 10),
			new Vector3d(-10, 50, 10),
			new Vector3d(-10, 40, 10),
			new Vector3d(0, 50, 60)
]
CSG hullSection = HullUtil.hull(points)

return [cube,movedCube,hulledCubes.movex(size*2),hullSection]