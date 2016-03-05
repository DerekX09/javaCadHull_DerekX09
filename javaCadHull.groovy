//Move and rotate opperations
double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//cubeIntersectSphere = cubeIntersectSphere.move(1,2,3);// vector notation
CSG movedCube =  new Sphere(size).toCSG()
			.movex(20)
			.movey(40)
			.movez(60)

//set colors

//This section is how you for a shape of the "shrinkwrap" of the 2 shapes. 
CSG hulledCubes = cube.union(movedCube).hull();

return [cube,movedCube,hulledCubes.movex(size*2)]