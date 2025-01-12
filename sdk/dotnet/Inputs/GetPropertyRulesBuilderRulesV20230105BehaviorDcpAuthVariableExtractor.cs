// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthVariableExtractorArgs : global::Pulumi.InvokeArgs
    {
        [Input("certificateField")]
        public string? CertificateField { get; set; }

        [Input("dcpMutualAuthProcessingVariableId")]
        public string? DcpMutualAuthProcessingVariableId { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthVariableExtractorArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthVariableExtractorArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorDcpAuthVariableExtractorArgs();
    }
}
