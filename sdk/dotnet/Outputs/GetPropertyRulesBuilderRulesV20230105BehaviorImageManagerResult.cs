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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorImageManagerResult
    {
        public readonly bool? Advanced;
        public readonly string? ApiReferenceTitle;
        public readonly bool? ApplyBestFileType;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorImageManagerCpCodeOriginalResult? CpCodeOriginal;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorImageManagerCpCodeTransformedResult? CpCodeTransformed;
        public readonly bool? Enabled;
        public readonly bool? Locked;
        public readonly string? PolicySet;
        public readonly string? PolicyToken;
        public readonly string? PolicyTokenDefault;
        public readonly bool? Resize;
        public readonly string? SettingsTitle;
        public readonly string? SuperCacheRegion;
        public readonly string? TemplateUuid;
        public readonly string? TrafficTitle;
        public readonly bool? UseExistingPolicySet;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorImageManagerResult(
            bool? advanced,

            string? apiReferenceTitle,

            bool? applyBestFileType,

            Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorImageManagerCpCodeOriginalResult? cpCodeOriginal,

            Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorImageManagerCpCodeTransformedResult? cpCodeTransformed,

            bool? enabled,

            bool? locked,

            string? policySet,

            string? policyToken,

            string? policyTokenDefault,

            bool? resize,

            string? settingsTitle,

            string? superCacheRegion,

            string? templateUuid,

            string? trafficTitle,

            bool? useExistingPolicySet,

            string? uuid)
        {
            Advanced = advanced;
            ApiReferenceTitle = apiReferenceTitle;
            ApplyBestFileType = applyBestFileType;
            CpCodeOriginal = cpCodeOriginal;
            CpCodeTransformed = cpCodeTransformed;
            Enabled = enabled;
            Locked = locked;
            PolicySet = policySet;
            PolicyToken = policyToken;
            PolicyTokenDefault = policyTokenDefault;
            Resize = resize;
            SettingsTitle = settingsTitle;
            SuperCacheRegion = superCacheRegion;
            TemplateUuid = templateUuid;
            TrafficTitle = trafficTitle;
            UseExistingPolicySet = useExistingPolicySet;
            Uuid = uuid;
        }
    }
}