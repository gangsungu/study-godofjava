public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass referencePass = new ReferencePass();
        referencePass.callPassByReference();
    }

    public void callPassByReference() {
        MemberDTO memberDTO = new MemberDTO("Jone Doe");
        System.out.println("before passByReference");
        System.out.println("memberDTO.name=" + memberDTO.name);

        passByReference(memberDTO);
        System.out.println("after passByReference");
        System.out.println("memberDTO.name=" + memberDTO.name);
    }

    public void passByReference(MemberDTO memberDTO) {
        memberDTO.name = "Jane Doe";
        System.out.println("in passByReference");
        System.out.println("MemberDTO.name=" + memberDTO.name);
    }
}

// before passByReference
// memberDTO.name=Jone Doe
// in passByReference
// MemberDTO.name=Jane Doe
// after passByReference
// memberDTO.name=Jane Doe