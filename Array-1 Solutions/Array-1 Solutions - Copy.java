*********************---- CodingBat Solutions ----**************************

************************---- By Siddesh -------**************************


===================================
************|| Array-1 ||**********
===================================



=======================================

firstLast6 **********


public boolean firstLast6(int[] nums) {
  if(nums[0]==6 || nums[nums.length-1]==6)
  {
    return true;
  }
  return false;
}

======================================================

sameFirstLast ********

public boolean sameFirstLast(int[] nums) {
  
  if(nums.length==0)
  {
    return false;
  }
  if(nums[0]!=nums[nums.length-1] )
  {
    return false;
  }
  return true;
}


================================================

makePi  **********


public int[] makePi() {
  int makepi[] = {3,1,4};
  return makepi;
}


===================================================

commonEnd **********


public boolean commonEnd(int[] a, int[] b) {
  
  if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
  {
    return true;
  }
  return false;
}


==============================================

 sum3 *******


public int sum3(int[] nums) {
  int sum = nums[0]+nums[1]+nums[2];
  return sum;
}



===============================================

rotateLeft3 ******

public int[] rotateLeft3(int[] nums) {
 int res[] = {nums[1],nums[2],nums[0]};

  
  return res;

}


================================================

reverse3 *******


public int[] reverse3(int[] nums) {
  int res[] = {nums[2],nums[1],nums[0]};
  return res;
  
}


=================================================
maxEnd3 ********

public int[] maxEnd3(int[] nums) {
  int[] maxVal = new int[3];
	maxVal[0] = nums[0];
	if(nums[2] >= maxVal[0])
		maxVal[0] = nums[2];
	maxVal[1] = maxVal[0];
	maxVal[2] = maxVal[0];
	return maxVal;
 
}


=======================================

sum2 ********


public int sum2(int[] nums) {
  
  if(nums.length==0)
  {
    return 0;
  }
  if(nums.length==1)
  {
    return nums[0];
  }
  
  int res=nums[0]+nums[1];
  return res;
}



===========================================

middleWay *******

public int[] middleWay(int[] a, int[] b) {
  int mid=a.length/2;
  int res[]= new int[2];
  res[0]=a[mid];
  res[1]=b[mid];
  return res;
}

===========================================
makeEnds ********


public int[] makeEnds(int[] nums) {
  int res[] = new int[2];
  res[0]=nums[0];
  res[1]=nums[nums.length-1];
  return res;
}

=============================================
has23 ******


public boolean has23(int[] nums) {
  if(nums[0]==2 || nums[0]==3 || nums[1]==2 || nums[1]==3)
  {
    return true;
  }
  return false;

}

================================================


no23 *******


public boolean no23(int[] nums) {
  if(nums[0]!=2 && nums[0]!=3 && nums[1]!=2 && nums[1]!=3 )
  {
    return true;
  }
  return false;
}

=================================================

makeLast *******


public int[] makeLast(int[] nums) {
  int [] res = new int[nums.length*2];
  res[res.length-1]=nums[nums.length-1];
  return res;
}


===================================================

double23********

public boolean double23(int[] nums) {
  if(nums.length==1 || nums.length==0)
  return false;
  if(nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3)
    return true;
  return false;
}



=============================================================

fix23 **********

public int[] fix23(int[] nums) {
  if (nums[0] == 2 && nums[1] == 3)
   nums[1] = 0;
   if (nums[1] == 2 && nums[2] == 3)
   nums[2] = 0;
   return new int[] {nums[0],nums[1],nums[2]};

}


==============================================================

start1 *******


public int start1(int[] a, int[] b) {
  int count=0 ;
  if (a.length != 0) {
   if (a[0]== 1) count++; }
  if (b.length != 0) {
     if (b[0]== 1) count++; }
     return count;

}


====================================================

 biggerTwo **************

public int[] biggerTwo(int[] a, int[] b) {
  if (b[1] + b[0] > a[1] + a[0])
  return b;
  else
  return a;
}


=========================================================

makeMiddle ****************


public int[] makeMiddle(int[] nums) {
  return new int[]{
nums[nums.length/2 -1], nums[nums.length/2]};
}

=============================================================

plusTwo *******************

public int[] plusTwo(int[] a, int[] b) {
  int []res = new int[4];
  
  res[0]=a[0];
  res[1]=a[1];
  res[2]=b[0];
  res[3]=b[1];
  return res;
}

====================================================
swapEnds ********


public int[] swapEnds(int[] nums) {
  int res[] = new int[nums.length];
  res[0]=nums[nums.length-1];
  res[res.length-1]=nums[0];
  for(int i=1;i<nums.length-1;i++)
  {
    res[i]=nums[i];
  }
  return res;
}

==================================================

midThree *************


public int[] midThree(int[] nums) {
  int mid=nums.length/2;
  int res[] = new int[3];
  res[0]=nums[mid-1];
  res[1]=nums[mid];
  res[2]=nums[mid+1];
  return res;
}

======================================================

maxTriple *************

public int maxTriple(int[] nums) {
 int max = nums[0];
    
    if(max < nums[nums.length / 2])
        max = nums[nums.length / 2];
              
    if(max < nums[nums.length - 1])
        max = nums[nums.length - 1];
                        
    return max;

}

==============================================

frontPiece **************

public int[] frontPiece(int[] nums) {
  
  if (nums.length == 1)
  return new int[] {nums[0]};

  else if (nums.length == 0)
  return new int[] {};

  else
  return new int[] {nums[0],nums[1]};

}

===============================================

unlucky1 ************

public boolean unlucky1(int[] nums) {
  if(nums.length==0 || nums.length==1)
  {
    return false;
  }
  if (nums[0]==1 && nums[1]==3)
  {
    return true;
  }
   if (nums[1]==1 && nums[2]==3)
  {
    return true;
  }
  if(nums[nums.length-1]==3 && nums[nums.length-2]==1)
  {
    return true;
  }
  return false;
}


=========================================================

make2 *********

public int[] make2(int[] a, int[] b) {
  int res[]= new int[2];
  if(a.length==0){
    res[0]=b[0];
    res[1]=b[1];
  }
   if(a.length==1){
    res[0]=a[0];
    res[1]=b[0];
  }
   if(a.length>=2){
    res[0]=a[0];
    res[1]=a[1];
  }
  
  return res;
}

===============================================

front11 *******

public int[] front11(int[] a, int[] b) {
  
  
  if (a.length == 0 && b.length == 0)
  return new int[] {};
  
  else if (a.length !=0 && b.length == 0)
  return new int[]{a[0]};
  
  else if (a.length == 0 && b.length != 0)
  return new int[]{b[0]};
  
  else
  return new int[] {a[0],b[0]};

}

=========================================================================
************************---- By Siddesh -------**************************









