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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuthResult
    {
        public readonly bool? ExtractHostname;
        public readonly bool? ExtractJurisdiction;
        public readonly bool? ExtractNamespace;
        public readonly string? HostnameClaim;
        public readonly string? JurisdictionClaim;
        public readonly bool? Locked;
        public readonly string? NamespaceClaim;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorDcpRealTimeAuthResult(
            bool? extractHostname,

            bool? extractJurisdiction,

            bool? extractNamespace,

            string? hostnameClaim,

            string? jurisdictionClaim,

            bool? locked,

            string? namespaceClaim,

            string? templateUuid,

            string? uuid)
        {
            ExtractHostname = extractHostname;
            ExtractJurisdiction = extractJurisdiction;
            ExtractNamespace = extractNamespace;
            HostnameClaim = hostnameClaim;
            JurisdictionClaim = jurisdictionClaim;
            Locked = locked;
            NamespaceClaim = namespaceClaim;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}