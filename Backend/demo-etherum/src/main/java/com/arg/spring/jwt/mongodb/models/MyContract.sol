pragma solidity >=0.4.22 <0.9.0;



contract myContract{
    
    struct BienImobiler {
        
        string titre;
        uint price;
        address  vendeur;
        address  acheteur;
        string date;
    }
    
    mapping (address => BienImobiler) bienImobilers;
    address[] public AllBienImobiliers;
    
    function setBienImobiler(address _vendeur,address  _acheteur, string  memory _titre, uint _price,string memory _date) public {
       
        
        bienImobilers[_acheteur].price = _price;
        bienImobilers[_acheteur].titre = _titre;
        bienImobilers[_acheteur].acheteur = _acheteur ;
        bienImobilers[_acheteur].vendeur = _vendeur ;
        bienImobilers[_acheteur].date = _date;
       AllBienImobiliers.push(_acheteur);
    }
    
    function getBienImobilers() view public returns(address[] memory) {
        return AllBienImobiliers;
    }
    
    function getBienImobiler(address _address) view public returns (address, address, string memory, uint,string memory) {
        return (bienImobilers[_address].vendeur, bienImobilers[_address].acheteur,bienImobilers[_address].titre, bienImobilers[_address].price,bienImobilers[_address].date);
    }
      function getTitre(address _address) view public returns (string memory) {
        return (bienImobilers[_address].titre);
    }
      function getPrice(address _address) view public returns (uint) {
        return (bienImobilers[_address].price);
    }
    function countBienImobilers() view public returns (uint) {
        return AllBienImobiliers.length;
    }
    
}