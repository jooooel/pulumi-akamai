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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClientResult
    {
        public readonly bool? AllowOverrideOriginCacheKey;
        public readonly string? ConnectorId;
        public readonly bool? Enabled;
        public readonly bool? Locked;
        public readonly string? OriginHostHeader;
        public readonly string? OriginType;
        public readonly string? Sf3cOriginHost;
        public readonly string? Sf3cOriginHostHeader;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClientResult(
            bool? allowOverrideOriginCacheKey,

            string? connectorId,

            bool? enabled,

            bool? locked,

            string? originHostHeader,

            string? originType,

            string? sf3cOriginHost,

            string? sf3cOriginHostHeader,

            string? templateUuid,

            string? uuid)
        {
            AllowOverrideOriginCacheKey = allowOverrideOriginCacheKey;
            ConnectorId = connectorId;
            Enabled = enabled;
            Locked = locked;
            OriginHostHeader = originHostHeader;
            OriginType = originType;
            Sf3cOriginHost = sf3cOriginHost;
            Sf3cOriginHostHeader = sf3cOriginHostHeader;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}