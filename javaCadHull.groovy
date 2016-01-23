//Move and rotate opperations
double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//cubeIntersectSphere = cubeIntersectSphere.move(1,2,3);// vector notation
CSG movedCube = cube
			.movex(10)
			.movey(20)
			.movez(30)
//rotate
//cubeIntersectSphere = cubeIntersectSphere.rot(15,20,30);// vector notation
movedCube = movedCube
			.rotx(15)
			.roty(20)
			.rotz(30)
//set colors

//This section is how you for a shape of the "shrinkwrap" of the 2 shapes. 
CSG hulledCubes = cube.union(movedCube).hull();

return [cube,movedCube,hulledCubes.movex(size*2)]