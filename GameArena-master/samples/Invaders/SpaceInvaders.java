public class SpaceInvaders
{
	public static void main(String[] args)
	{
		int numberOfBaddiesPerRow = 6;
		int numberOfBaddieRows = 4;
		int numberOfBaddies = numberOfBaddiesPerRow * numberOfBaddieRows;
		double baddieSpeed = 1.0;
		double goodGuySpeed = 11.0;
		double bulletSpeed = 30.0;
		boolean exiting = false;

		GameArena a = new GameArena(1000,650);

		CompoundShape[] baddies = new CompoundShape[numberOfBaddies];
		CompoundShape goodGuy = new CompoundShape(a.getArenaWidth()/2, a.getArenaHeight()-50);
		CompoundShape bullet = new CompoundShape(a.getArenaWidth()/2, a.getArenaHeight()-50);

		// Make the GoodGuy
		goodGuy.addRectangle(new Rectangle(0,20,50,20, "RED"));
		goodGuy.addRectangle(new Rectangle(0,5,6,10, "GREEN"));
		goodGuy.addShapeTo(a);

		// Make the bullet
		bullet.addRectangle(new Rectangle(0,5,6,10, "RED"));
		bullet.addShapeTo(a);

		while (!exiting)
		{
			baddieSpeed = 1.0;

			// Make the Baddies
			int i = 0;
			for (int y = 0; y<numberOfBaddieRows; y++)
			{
				for (int x = 0; x<numberOfBaddiesPerRow; x++)
				{
					baddies[i] = new CompoundShape(x*a.getArenaWidth()*0.75/numberOfBaddiesPerRow, y*a.getArenaHeight()*0.5/numberOfBaddieRows);
					baddies[i].addRectangle(new Rectangle(30,5,20,10, "GREEN"));
					baddies[i].addRectangle(new Rectangle(30,15,40,10, "GREEN"));
					baddies[i].addRectangle(new Rectangle(30,35,60,30, "GREEN"));
					baddies[i].addRectangle(new Rectangle(15,55,10,10, "GREEN"));
					baddies[i].addRectangle(new Rectangle(45,55,10,10, "GREEN"));
					baddies[i].addRectangle(new Rectangle(15,25,10,10, "YELLOW"));
					baddies[i].addRectangle(new Rectangle(45,25,10,10, "YELLOW"));

					baddies[i].addShapeTo(a);
					i++;
				}
			}

			boolean moveBaddiesDown = false;
			boolean bulletFired = false;
			boolean gameover = false;
			
			while(!gameover)
			{
				int activeBaddies = 0;
				
				moveBaddiesDown = false;
				if (a.leftPressed())
				{
					goodGuy.move(-goodGuySpeed,0);
					if (!bulletFired)
						bullet.move(-goodGuySpeed,0);
				}

				if (a.rightPressed())
				{
					goodGuy.move(goodGuySpeed,0);
					if (!bulletFired)
						bullet.move(goodGuySpeed,0);
				}

				if (a.upPressed())
					bulletFired = true;

				// move the bullet
				if (bulletFired)
				{
					bullet.move(0,-bulletSpeed);

					if (bullet.getYPosition()<0)
					{
						bulletFired = false;
						bullet.moveTo(goodGuy.getXPosition(),goodGuy.getYPosition()); 
					}
				}

				// move the baddies
				for (i=0; i<numberOfBaddies; i++)
				{
					if (baddies[i] != null)
					{
						activeBaddies++;
						baddies[i].move(baddieSpeed, 0);
						if (baddies[i].getXPosition() < 0 || baddies[i].getXPosition()>a.getArenaWidth()-60)
						{
							baddieSpeed = -baddieSpeed;
							moveBaddiesDown = true;
						}

						if (baddies[i].collides(goodGuy) || baddies[i].getYPosition()>a.getArenaHeight())
						{
							System.out.println("Gotcha!!!");
							gameover = true;
						}

						if (bulletFired && baddies[i].collides(bullet))
						{
							baddies[i].removeShapeFrom(a);
							baddies[i] = null;
							baddieSpeed *= 1.15;
							bulletFired = false;
							bullet.moveTo(goodGuy.getXPosition(),goodGuy.getYPosition()); 
						}
					}
				}

				// move baddies down if needed
				if (moveBaddiesDown)
				{
					for (i=0; i<numberOfBaddies; i++)
					{
						if (baddies[i] != null)
							baddies[i].move(0, 25);
					}
				}

				// Exit loop if all baddies are toast
				if (activeBaddies == 0)
				{
					System.out.println("You got all the alien scum!");
					gameover = true;
				}

				a.pause();
			}

			for (i=0; i<numberOfBaddies; i++)
			{
				if (baddies[i] != null)
				{
					baddies[i].removeShapeFrom(a);
					baddies[i] = null;
				}
			}
		}
	}
}
