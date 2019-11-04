SELECT * FROM country WHERE HeadOfState like 'Fernando de la %';
SELECT count(name) FROM city WHERE CountryCode like 'CHN';
SELECT * FROM country WHERE Population ORDER BY Population ASC;
SELECT C.Name, C.CountryCode, CC.Name FROM city AS C 
		INNER JOIN country AS CC ON C.CountryCode = CC.Code 
        ORDER BY CC.Name ASC, C.Name ASC;