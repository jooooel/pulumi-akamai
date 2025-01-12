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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseResult
    {
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseCloudletPolicyResult? CloudletPolicy;
        public readonly bool? Enabled;
        public readonly int? FailoverDuration;
        public readonly bool? FailoverEnabled;
        public readonly ImmutableArray<string> FailoverResponseCodes;
        public readonly string? FailoverTitle;
        public readonly string? Label;
        public readonly bool? Locked;
        public readonly string? PopulationCookieType;
        public readonly string? PopulationDuration;
        public readonly string? PopulationExpirationDate;
        public readonly bool? PopulationRefresh;
        public readonly string? PopulationTitle;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseResult(
            Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseCloudletPolicyResult? cloudletPolicy,

            bool? enabled,

            int? failoverDuration,

            bool? failoverEnabled,

            ImmutableArray<string> failoverResponseCodes,

            string? failoverTitle,

            string? label,

            bool? locked,

            string? populationCookieType,

            string? populationDuration,

            string? populationExpirationDate,

            bool? populationRefresh,

            string? populationTitle,

            string? templateUuid,

            string? uuid)
        {
            CloudletPolicy = cloudletPolicy;
            Enabled = enabled;
            FailoverDuration = failoverDuration;
            FailoverEnabled = failoverEnabled;
            FailoverResponseCodes = failoverResponseCodes;
            FailoverTitle = failoverTitle;
            Label = label;
            Locked = locked;
            PopulationCookieType = populationCookieType;
            PopulationDuration = populationDuration;
            PopulationExpirationDate = populationExpirationDate;
            PopulationRefresh = populationRefresh;
            PopulationTitle = populationTitle;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
