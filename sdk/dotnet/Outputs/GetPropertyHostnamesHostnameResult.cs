// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyHostnamesHostnameResult
    {
        public readonly string CertProvisioningType;
        public readonly ImmutableArray<Outputs.GetPropertyHostnamesHostnameCertStatusResult> CertStatuses;
        public readonly string CnameFrom;
        public readonly string CnameTo;
        public readonly string CnameType;
        public readonly string EdgeHostnameId;

        [OutputConstructor]
        private GetPropertyHostnamesHostnameResult(
            string certProvisioningType,

            ImmutableArray<Outputs.GetPropertyHostnamesHostnameCertStatusResult> certStatuses,

            string cnameFrom,

            string cnameTo,

            string cnameType,

            string edgeHostnameId)
        {
            CertProvisioningType = certProvisioningType;
            CertStatuses = certStatuses;
            CnameFrom = cnameFrom;
            CnameTo = cnameTo;
            CnameType = cnameType;
            EdgeHostnameId = edgeHostnameId;
        }
    }
}