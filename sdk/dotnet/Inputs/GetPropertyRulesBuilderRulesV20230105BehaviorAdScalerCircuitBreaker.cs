// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorAdScalerCircuitBreakerArgs : global::Pulumi.InvokeArgs
    {
        [Input("fallbackActionResponseCodeBased")]
        public string? FallbackActionResponseCodeBased { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("responseCodeBased")]
        public bool? ResponseCodeBased { get; set; }

        [Input("responseCodes")]
        public string? ResponseCodes { get; set; }

        [Input("responseDelayBased")]
        public bool? ResponseDelayBased { get; set; }

        [Input("responseDelayThreshold")]
        public string? ResponseDelayThreshold { get; set; }

        [Input("returnErrorResponseCodeBased")]
        public string? ReturnErrorResponseCodeBased { get; set; }

        [Input("specifyYourOwnResponseCodeBased")]
        public string? SpecifyYourOwnResponseCodeBased { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorAdScalerCircuitBreakerArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorAdScalerCircuitBreakerArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorAdScalerCircuitBreakerArgs();
    }
}
