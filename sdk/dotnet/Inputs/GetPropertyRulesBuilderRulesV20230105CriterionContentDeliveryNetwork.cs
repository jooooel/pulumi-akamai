// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105CriterionContentDeliveryNetworkArgs : global::Pulumi.InvokeArgs
    {
        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("matchOperator")]
        public string? MatchOperator { get; set; }

        [Input("network")]
        public string? Network { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105CriterionContentDeliveryNetworkArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105CriterionContentDeliveryNetworkArgs Empty => new GetPropertyRulesBuilderRulesV20230105CriterionContentDeliveryNetworkArgs();
    }
}
